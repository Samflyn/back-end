package org.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

//    Alternate for using init mocks manually, In extension beforeEach does the same as we do it manually
@ExtendWith(MockitoExtension.class)
class JunitExtensionTest {

    @Mock
    Map<String, Object> objectMap;

    @Test
    void testMockitoAnnotationsOpenMocks() {
        assertDoesNotThrow(() -> objectMap.put("one", "two"));
    }
}
