package org.example.controller;

import org.example.service.SomeOtherService;
import org.example.service.SomeService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeControllerMockitoAdvanced {
    @Mock
    SomeService someService;

    @InjectMocks
    SomeController someController;

    @Spy // wrapper around the real object
    SomeOtherService someOtherService;

    @Test
    void throwingExceptionInMockito() {
        when(someService.isWorking(false)).thenThrow(new RuntimeException("Some error"));
        when(someService.isWorking(true)).thenReturn(true);

        assertDoesNotThrow(() -> someController.callServiceBoolean(true));

        assertThrows(RuntimeException.class, () -> someController.callServiceBoolean(false));
    }

    @Test
    void throwingExceptionForVoid() {
        doThrow(new RuntimeException()).when(someService).printSomething();

        assertThrows(RuntimeException.class, () -> someController.exception());
    }

    @Test
    @Disabled
    void argumentMatcher() {
        when(someService.isWorking(argThat(argument -> argument.equals(false)))).thenReturn(true);

        assertTrue(someController.callServiceBoolean(false));
    }

    @Test
    void argumentCaptorTest() {
        final var captor = ArgumentCaptor.forClass(Boolean.class);

        when(someService.isWorking(captor.capture())).thenReturn(true);
        when(someService.isWorking(booleanArgumentCaptor.capture())).thenReturn(true);

        assertTrue(someController.callServiceBoolean(false));

        assertFalse(captor.getValue());
        assertFalse(booleanArgumentCaptor.getValue());
    }

    //    same as above test but by using annotation
    @Captor
    ArgumentCaptor<Boolean> booleanArgumentCaptor;

    @Test
    void doAnswerInvocation() {
        doAnswer(invocation -> {
            Object argument = invocation.getArgument(0);
            boolean aBoolean = Boolean.parseBoolean(argument.toString());
            assertFalse(aBoolean);
            return false;
        }).when(someService).doSomething(false);

        someController.doSomething();
    }

    @Test
    @Disabled
    void verifyOrder() {
        InOrder inOrder = inOrder(someService);
//        below we verify the order of invocation
        inOrder.verify(null);
    }

    @Test
    void timeOut() {
        verify(someService, timeout(1000)).isWorking(false);
        someController.callServiceBoolean(false);
    }

    @Test
    void noInteractions() {
        verifyNoInteractions(someService);
        verifyNoMoreInteractions(someService);
    }
}
