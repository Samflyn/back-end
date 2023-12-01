package com.example.springgrpc.service;

import com.example.springgrpc.mapper.UserMapper;
import com.example.springgrpc.repository.UserRepository;
import com.example.springgrpc.user.CreateUserRequest;
import com.example.springgrpc.user.CreateUserResponse;
import com.example.springgrpc.user.SomeMessage;
import com.example.springgrpc.user.UserListRequest;
import com.example.springgrpc.user.UserListResponse;
import com.example.springgrpc.user.UserServiceGrpc;
import com.google.gson.JsonParser;
import com.google.protobuf.util.JsonFormat;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void getUserList(UserListRequest request, StreamObserver<UserListResponse> responseObserver) {
        final var userList = userRepository.findAll();

        final var userModelList = userMapper.map(userList);

        final var userResponse = UserListResponse.newBuilder().addAllUserList(userModelList).build();

        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        var user = userMapper.map(request);

        final var savedUser = userRepository.save(user);

        final var createUserResponse = CreateUserResponse.newBuilder().setId(savedUser.getId()).build();

        responseObserver.onNext(createUserResponse);
        responseObserver.onCompleted();
    }

    @PostConstruct
    public void start() throws IOException {
        String readString = Files.readString(Path.of("/Users/akhil/Downloads/Codes/grpc-demo/src/main/resources/Json.txt"));
        SomeMessage.Builder builder = SomeMessage.newBuilder();
        String parse = JsonParser.parseString(readString).toString();
        JsonFormat.parser().ignoringUnknownFields().merge(parse, builder);
        SomeMessage build = builder.build();
        Files.write(Path.of("", "proto.txt"), build.toByteArray());
    }
}
