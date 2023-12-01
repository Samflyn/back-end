package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
public class Server {
    @GetMapping("/list")
    public List<Integer> getList() {
        File file = new File("");
        System.out.println(file.getAbsolutePath());
        System.out.println("Processing Request at: " + System.currentTimeMillis());
        final ArrayList<Integer> integers = new ArrayList<>();
        final IntStream ints = new Random().ints(50);
        ints.forEach(integers::add);
        return integers;
    }
}
