package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CheckForSubsequenceTest {

    @InjectMocks
    private CheckForSubsequence checkForSubsequence;

    @Test
    void isSubSequenceTest() {
        assertEquals(1,checkForSubsequence.isSubSequence("gksrek", "geeksforgeeks"));
    }
}