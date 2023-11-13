package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GoodOrBadStringTest {

    @InjectMocks
    private GoodOrBadString goodOrBadString;

    @Test
    void isGoodOrBadTest() {
        assertEquals(0,goodOrBadString.isGoodOrBad("aeioup??"));
    }
}