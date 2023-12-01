package org.example.controller;

import org.junit.jupiter.api.Test;

class SomeControllerTest implements ControllerTests {
    @Test
    void someTest() {
        System.out.println("We can use interface to run tests instead of using tags for each test classes");
    }
}
