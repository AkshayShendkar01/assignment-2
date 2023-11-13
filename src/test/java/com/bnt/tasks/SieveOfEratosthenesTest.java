package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class SieveOfEratosthenesTest {

    @InjectMocks
    private SieveOfEratosthenes sieveOfEratosthenes;

    @Test
    void sieveOfEratosthenesTest() {
        assertThat(sieveOfEratosthenes.sieveOfEratosthenes(35)).containsExactly(2, 3, 4, 5, 7, 11, 13, 17, 19, 23, 29, 31);
    }
}