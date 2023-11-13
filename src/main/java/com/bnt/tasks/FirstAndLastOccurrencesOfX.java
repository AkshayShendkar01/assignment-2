package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FirstAndLastOccurrencesOfX {
    int[] firstAndLast(int[] arr, int size, int x) {
        int[] occurence = new int[2];
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        occurence[0] = collect.indexOf(x);
        occurence[1] = collect.lastIndexOf(x);
       return occurence;
    }

}
