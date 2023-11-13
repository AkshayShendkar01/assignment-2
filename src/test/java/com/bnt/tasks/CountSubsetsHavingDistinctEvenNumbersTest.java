package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CountSubsetsHavingDistinctEvenNumbersTest {

    @InjectMocks
    private CountSubsetsHavingDistinctEvenNumbers count;

    @Test
    void countSubsetsTest() {
    assertEquals(9,count.countSubsets(new int[]{4, 2, 1, 9, 2, 6, 5, 3}));
    }

}