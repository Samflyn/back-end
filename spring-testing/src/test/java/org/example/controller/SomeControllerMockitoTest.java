package org.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class SomeControllerMockitoTest {

    @Mock
    Map<String, Object> objectMap;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testMockitoAnnotationsOpenMocks() {
        assertDoesNotThrow(() -> objectMap.put("one", "two"));
    }

    @Test
    void inLineMocks() {
        Mockito.mock(Map.class);
    }
}
