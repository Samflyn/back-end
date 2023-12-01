package com.example.grpcdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class ProtoController {

    @PostMapping("/get-proto")
    public byte[] getProto(@RequestBody byte[] bytes) {
        return bytes;
    }

    @GetMapping("/get-proto-first")
    public byte[] getProtoFirst() throws IOException {
        return Files.readAllBytes(Path.of("/Users/akhil/Downloads/Codes/grpc-demo/proto.txt"));
    }
}
