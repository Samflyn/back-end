package org.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collections;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Advanced Junit")
class GreetingTestWithAdvancedJunit {

    @BeforeEach
    void setUp() {
        System.out.println("First before each");
    }

    @Nested
    class NestedClassForTests {

        @BeforeEach
        void setUp() {
            System.out.println("Nested before each");
        }

        @Test
        void somethingToTest() {
            assertThat(Collections.emptyList()).isEmpty();
        }
    }

    @DisplayName("Repeating tests")
    @RepeatedTest(value = 10)
    void repeatedTest() {
        assertThat(Collections.emptyList()).isEmpty();
    }

    @RepeatedTest(5)
    void dependencyInjection(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ":" + repetitionInfo.getCurrentRepetition());
    }


    @ParameterizedTest
    @ValueSource(strings = {"one", "two", "three"})
//    @EnumSource(Enum.class)
//    @CsvSource({"One, 1", "Two, 2", "Three, 3"})
    void parameterTestWithValueSource(String number) {
        System.out.println(number);
    }

    @ParameterizedTest
    @MethodSource("getArgs")
    void fromMethodTest(String number, int val) {
        System.out.println(number + " : " + val);
    }

    static Stream<Arguments> getArgs() {
        return Stream.of(Arguments.of("one", 1));
    }
}