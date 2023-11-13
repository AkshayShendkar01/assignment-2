package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PalindromeTest {

    @InjectMocks
    private Palindrome palindrome;

    @Test
    void is_palindrome1Test() {
    assertEquals("Yes",palindrome.is_palindrome1(121));
    }
}