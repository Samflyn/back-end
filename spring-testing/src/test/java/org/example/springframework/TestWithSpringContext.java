package org.example.springframework;

import org.example.controller.SomeController;
import org.example.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@TestPropertySource("classpath:some.properties")
@SpringJUnitConfig(classes = {SomeController.class, SomeService.class})
class TestWithSpringContext {

    @Test
    void name() {
    }
}
