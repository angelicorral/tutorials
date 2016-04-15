package com.baeldung;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.expectThrows;

public class ExceptionTest {

    @Test
    void shouldThrowException() {
        Throwable exception = expectThrows(NullPointerException.class, null);
        assertEquals(exception.getClass(), NullPointerException.class);
    }
}
