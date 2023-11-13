package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class KthSmallestElementTest {

    @InjectMocks
    private KthSmallestElement kthSmallestElement;

    @Test
    void kthSmallestTest() {
        assertEquals(7,kthSmallestElement.kthSmallest(new int[]{7,10,4,3,20,15},3));
    }
}