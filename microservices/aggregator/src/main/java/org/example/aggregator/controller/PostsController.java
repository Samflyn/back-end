package org.example.aggregator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
}
