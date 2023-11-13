package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConvertArrayIntoZigZagFashionTest {

    @InjectMocks
    private ConvertArrayIntoZigZagFashion convert;

    @Test
    void zigZagTest() {
        assertArrayEquals(new int[]{1,8,2,7,3,6,4},convert.zigZag(new int[]{4, 3, 7, 8, 6, 2, 1}));
    }
}