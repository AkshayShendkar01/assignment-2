package com.bnt.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
public int  print2largest(int[] arg){
    List<Integer> collect = Arrays.stream(arg).boxed().distinct()
                           .sorted().collect(Collectors.toList());

    return collect.get(collect.size()-2);
}
}
