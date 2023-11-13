package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ImmediateSmallerElementTest {

    @InjectMocks
    private ImmediateSmallerElement immediateSmallerElement;

    @Test
    void immediateSmaller() {
    assertArrayEquals(new int[]{-1, 2, -1, 1, -1, -1},immediateSmallerElement.immediateSmaller(new int[]{5, 6, 2, 3, 1, 7}));
    }
}