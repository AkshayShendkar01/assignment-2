package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class Fibonacci_Nth_NumberTest {

    @InjectMocks
    private Fibonacci_Nth_Number fibonacci_nth_number;

    @Test
    void nthFibonacciTest() {
    assertEquals(5,fibonacci_nth_number.nthFibonacci(5));
    }
}