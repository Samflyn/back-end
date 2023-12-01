package org.example;

import org.example.controller.SomeController;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("Testing with Junit")
class GreetingTestWithJunit5 {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Run once Before class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Run before each test");
        greeting = new Greeting();
    }

    @Test
    @DisplayName("Test for hello world")
    void testHelloWorld() {
        assertEquals("HELLO WORLD", greeting.helloWorld(), "Assertion failed message for hello world");
        assertEquals("HELLO WORLD", greeting.helloWorld(), () -> "Assertion failed message for hello world");
    }

    @Test
    void testHelloNameGrouped() {
        assertAll("Grouped Assertions",
                () -> assertEquals("HELLO sam", greeting.helloName("sam")),
                () -> assertEquals("HELLO WORLD", greeting.helloWorld()));
    }

    @Test
    void dependantAssertions() {
        assertAll("Dependant Assertions",
                () -> {
                    assertAll("One assertion",
                            () -> assertTrue(true),
                            () -> assertFalse(false));
                },
                () -> {
                    assertAll("Two assertions",
                            () -> assertEquals(1, 1));
                });
    }

    @Test
    void exceptionAssertions() {
        SomeController someController = new SomeController();
        assertThrows(IllegalArgumentException.class, someController::exception, "Something failed here");
    }

    @Test
    void timeOutAssertions() {
        assertTimeout(Duration.ofMillis(10), () -> Thread.sleep(5), "Running on same thread and does not kill the supplier if the timeout is exceeded");

        assertTimeoutPreemptively(Duration.ofMillis(10), () -> Thread.sleep(5), "Running on new thread and kill the supplier if the timeout is exceeded");
    }

    @Test
    void testAssumptionTrue() {
        assumeTrue("MAC".equalsIgnoreCase(System.getenv("OS")));
        System.out.println("I do not run");
    }

    @Test
//    @EnabledIf(value = "")
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    @EnabledIfEnvironmentVariable(named = "USER", matches = "sam")
    void testAssumptionFalse() {
        assumeFalse("MAC".equalsIgnoreCase(System.getenv("OS")));
        System.out.println("I run here");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Run after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Run once after class");
    }
}
