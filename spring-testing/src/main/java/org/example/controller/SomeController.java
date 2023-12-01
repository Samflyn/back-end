package org.example.controller;

import org.example.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SomeController {

    @Autowired
    SomeService someService;

    public void exception() {
        someService.printSomething();
        throw new IllegalArgumentException("Some error occurred");
    }

    @GetMapping("/callServiceBoolean")
    public boolean callServiceBoolean(boolean b) {
        return someService.isWorking(b);
    }

    public boolean doSomething() {
        return someService.doSomething(false);
    }
}
