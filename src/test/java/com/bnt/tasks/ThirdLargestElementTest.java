package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ThirdLargestElementTest {

    @InjectMocks
    private ThirdLargestElement thirdLargestElement;

    @Test
    void thirdLargestTest() {
    assertEquals(12,thirdLargestElement.thirdLargest(new int[]{12, 35, 1, 10, 34, 1}));
    }
}