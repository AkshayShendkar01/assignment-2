package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CountPairsWithGivenSumTest {

    @InjectMocks
    private CountPairsWithGivenSum count;

    @Test
    void getPairsCountTest() {
        assertEquals(6,count.getPairsCount(new int[]{1, 1, 1, 1},4,2));
    }
}