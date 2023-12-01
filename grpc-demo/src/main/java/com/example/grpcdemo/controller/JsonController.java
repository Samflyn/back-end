package com.example.grpcdemo.controller;

import com.example.grpcdemo.model.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class JsonController {

    @PostMapping("/get-user")
    public Data getUser(@RequestBody Data user) {
        return user;
    }

    @GetMapping("/get-user-first")
    public Data getUserFirst() throws IOException {
        return new ObjectMapper().readValue(Files.readAllBytes(Path.of("/Users/akhil/Downloads/Codes/grpc-demo/src/main/resources/Json.txt")), Data.class);
    }

//    @PostMapping("/get-proto")
//    public byte[] getUserBytes(@RequestBody byte[] userData) {
//        return userData;
//    }
//
//    @GetMapping("/get-proto-first")
//    public byte[] getProto() {
//        return com.example.grpcdemo.model.User
//                .newBuilder()
//                .setFirstName("firstName")
//                .setLastName("lastName")
//                .setPhone(999999L)
//                .build()
//                .toByteArray();
//    }
}
//
//class User {
//    public String firstName;
//    public String lastName;
//    public long phone;
//
//    public User(String firstName, String lastName, long phone) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phone = phone;
//    }
//}
