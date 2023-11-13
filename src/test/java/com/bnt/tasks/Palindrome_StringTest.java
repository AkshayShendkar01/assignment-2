package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class Palindrome_StringTest {

    @InjectMocks
    private Palindrome_String palindrome_string;

    @Test
    void isPalindrome() {
    assertEquals(1,palindrome_string.isPalindrome("aba"));
    }
}