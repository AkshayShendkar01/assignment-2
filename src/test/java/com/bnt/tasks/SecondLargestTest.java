package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SecondLargestTest {

    @InjectMocks
    private SecondLargest secondLargest;

    @Test
    void print2largest() {
    assertEquals(34,secondLargest.print2largest(new int[]{12, 35, 1, 10, 34, 1}));
    }
}