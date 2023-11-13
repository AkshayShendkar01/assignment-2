package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class Merge_two_stringsTest {

    @InjectMocks
    private Merge_two_strings merge_two_strings;

    @Test
    void mergeTest() {
        assertEquals("HBeylelo",merge_two_strings.merge("Hello","Bye"));
    }
}