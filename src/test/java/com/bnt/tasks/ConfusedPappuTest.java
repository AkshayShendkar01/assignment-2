package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConfusedPappuTest {

    @InjectMocks
    private ConfusedPappu confusedPappu;

    @Test
    void indDiffTest() {
        assertEquals(33,confusedPappu.indDiff(66));
    }
}