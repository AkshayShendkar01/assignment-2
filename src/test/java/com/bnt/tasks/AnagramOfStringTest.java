package com.bnt.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AnagramOfStringTest {

    @InjectMocks
    private AnagramOfString anagram;

    @Test
    void remAnagramTest() {
        assertEquals(2,anagram.remAnagram("cddgk","gcd"));
    }
}