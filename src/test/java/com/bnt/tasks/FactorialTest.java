package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FactorialTest {

    @InjectMocks
    private Factorial factorial;
    @Test
    void factorialTest() {
        assertEquals(120,factorial.factorial(5));
    }
}