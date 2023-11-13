package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FirstAndLastOccurrencesOfXTest {

    @InjectMocks
    private FirstAndLastOccurrencesOfX firstAndLastOccurrencesOfX;

    @Test
    void firstAndLastTest() {
    assertArrayEquals(new int[]{1,2},firstAndLastOccurrencesOfX.firstAndLast(new int[]{  1, 3, 3, 4}, 4, 3));
    }
}