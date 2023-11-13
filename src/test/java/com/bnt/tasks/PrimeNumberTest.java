package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PrimeNumberTest {

    @InjectMocks
    private PrimeNumber primeNumber;

    @Test
    void isPrime() {
    assertEquals(1,primeNumber.isPrime(11));
    }
}