package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UniqueNumberOfOccurrencesTest {

    @InjectMocks
    private UniqueNumberOfOccurrences uniqueNumberOfOccurrences;

    @Test
    void isFrequencyUnique() {
    assertEquals(Boolean.FALSE,uniqueNumberOfOccurrences.isFrequencyUnique(new int[]{1, 1, 2, 5, 5}));
    }
}