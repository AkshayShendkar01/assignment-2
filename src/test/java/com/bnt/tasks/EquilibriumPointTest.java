package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EquilibriumPointTest {

    @InjectMocks
    private EquilibriumPoint equilibriumPoint;

    @Test
    void equilibriumPointTest() {
        assertEquals(3,equilibriumPoint.equilibriumPoint(new int[]{1,3,5,2,2},5));
    }
}