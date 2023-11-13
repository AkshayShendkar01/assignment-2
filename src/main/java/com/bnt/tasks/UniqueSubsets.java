package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UniqueSubsets {

    public List<List<Integer>> AllSubsets(int[] a) {

        List<List<Integer>> subsets = new ArrayList<List<Integer>>();

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(a[i]);
            subsets.add(new ArrayList<>(list));
            for (int next = i; next < a.length; next++) {
                list.removeAll(list);
                list.add(a[i]);
                for (int j = next + 1; j < a.length; j++) {
                    list.add(a[j]);
                    subsets.add(new ArrayList<>(list));
                }
            }
        }

        List<List<Integer>> lexicographicalOrderSubsetList = subsets.stream()
                //.map(integers -> integers.stream().sorted().collect(Collectors.toList()))
                .distinct()
                .sorted((o1, o2) -> {
                    if (o1.get(0) == o2.get(0)){
                        if(o1.size()==1){
                            return -1;
                        } else if (o2.size()==1) {
                            return 1;
                        }else {
                            for (int i=1;i<(o1.size()<o2.size()? o1.size():o2.size());i++){
                                if(o1.get(i)>o2.get(i))
                                    return 1;
                                else if (o1.get(i)<o2.get(i))
                                    return -1;
                            }
                            return 0;
                        }
                    }
                    else if (o1.get(0) > o2.get(0)){
                        return 1;
                    } else{
                        return -1;
                    }
                }).collect(Collectors.toList());

        subsets.removeAll(subsets);
        subsets.add(new ArrayList<>());
        subsets.addAll(lexicographicalOrderSubsetList);


        return subsets;
    }

}
