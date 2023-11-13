package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MaximumProductSubarrayTest {

    @InjectMocks
    private MaximumProductSubarray maximumProductSubarray;

    @Test
    void maxProduct() {
        assertEquals(120,maximumProductSubarray.maxProduct(new int[]{2, 3, 4, 5, -1, 0}, 6));
    }
}