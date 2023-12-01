package org.example.controller;

import org.assertj.core.api.Assertions;
import org.example.service.SomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockitoInjectionTest {

    @Mock
    SomeService someService;

    @InjectMocks
    SomeController someController;

    @Test
    void verifyServiceCall() {
        when(someService.isWorking(false)).thenReturn(false);
        when(someService.isWorking(anyBoolean())).thenReturn(false);
        when(someService.isWorking(any())).thenReturn(false);

        boolean response = someController.callServiceBoolean(true);

        Assertions.assertThat(response).isFalse();

        verify(someService, atLeastOnce()).isWorking(false);
    }

    @Test
    void bddVerifyServiceCall() {
        given(someService.isWorking(false)).willReturn(false);

        boolean response = someController.callServiceBoolean(true);

        Assertions.assertThat(response).isFalse();

        then(someService).should(atLeastOnce()).isWorking(false);
        then(someService).shouldHaveNoMoreInteractions();
    }
}
