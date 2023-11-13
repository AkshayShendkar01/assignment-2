package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MissingNumberInArrayTest {

    @InjectMocks
    private MissingNumberInArray missingNumberInArray;

    @Test
    void missingNumberTest() {
    assertEquals(9,missingNumberInArray.missingNumber(new int[]{6,1,2,8,3,4,7,10,5},10));
    }
}