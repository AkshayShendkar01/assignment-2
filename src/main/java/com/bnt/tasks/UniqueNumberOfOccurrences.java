package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class UniqueNumberOfOccurrences {
    public boolean isFrequencyUnique(int[] num) {
        List<Integer> value = Arrays.stream(num).boxed().collect(Collectors.toList());
        List<Integer> key = value.stream().distinct().collect(Collectors.toList());
        Map<Integer, Integer> occurrence = new HashMap<>();
        int count = 0;
        for (int i = 0; i < key.size(); i++) {
            for (int j = 0; j < value.size(); j++) {
                if (value.get(j) == key.get(i)) {
                    count++;
                }
            }
            occurrence.put(key.get(i), count);
            count = 0;
            int remove = key.get(i);
            value.removeIf(integer -> integer == remove);
        }

        List<Integer> keys = occurrence.keySet().stream().collect(Collectors.toList());

        for (int i=0;i<keys.size();i++){
            for (int j=i+1;j<keys.size();j++){
                if(occurrence.get(keys.get(i))==occurrence.get(keys.get(j))){
                    return false;
                }
            }
        }

        return true;
    }

}
