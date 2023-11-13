package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UniqueSubsetsTest {

    @InjectMocks
    private UniqueSubsets uniqueSubsets;

    @Test
    void allSubsets() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(1,2,3));
        expected.add(Arrays.asList(1,2,3,3));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(1, 3, 3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(3,3));

        List<List<Integer>> list = uniqueSubsets.AllSubsets(new int[]{1, 2, 3, 3});
        assertEquals(expected,list);
    }
}