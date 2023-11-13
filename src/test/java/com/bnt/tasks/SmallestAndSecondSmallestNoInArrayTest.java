package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SmallestAndSecondSmallestNoInArrayTest {

    @InjectMocks
    private SmallestAndSecondSmallestNoInArray smallestAndSecondSmallestNoInArray;

    @Test
    void minAnd2ndMinTest() {
       assertThat(smallestAndSecondSmallestNoInArray.minAnd2ndMin(new int[]{5,2,4,3,5,6}))
               .containsExactly(2,3);
    }
}