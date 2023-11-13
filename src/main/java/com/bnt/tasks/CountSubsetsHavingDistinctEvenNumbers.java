package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountSubsetsHavingDistinctEvenNumbers {
    public int countSubsets(int[] num) {

        List<List<Integer>> subsets = new ArrayList<List<Integer>>();

        for (int i = 0; i < num.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(num[i]);
            subsets.add(new ArrayList<>(list));
            for (int next = i; next < num.length; next++) {
                list.removeAll(list);
                list.add(num[i]);
                for (int j = next + 1; j < num.length; j++) {
                    list.add(num[j]);
                    subsets.add(new ArrayList<>(list));
                }

            }
        }

        long evenNumSubsetCount = subsets.stream().distinct()
                .filter(list -> list.stream().allMatch(integer -> integer % 2 == 0))
                .count();

        return (int) evenNumSubsetCount;
    }


}
