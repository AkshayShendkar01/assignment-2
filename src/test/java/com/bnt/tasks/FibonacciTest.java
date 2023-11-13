package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FibonacciTest {

    @InjectMocks
    private Fibonacci fibonacci;


    @Test
    void series() {
    assertEquals("0 1 1 2 3 5 ",fibonacci.series(5));
    }
}