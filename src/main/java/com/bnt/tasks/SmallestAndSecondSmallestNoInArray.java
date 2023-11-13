package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Vector;

@Component
public class SmallestAndSecondSmallestNoInArray {
    public Vector minAnd2ndMin(int[] array) {
        Vector<Integer> vector = new Vector<>();
        try {
            if (array.length > 0) {
                Arrays.sort(array);
                vector.add(array[0]);
                for (int i = 1; i < array.length; i++) {
                    if (array[0] < array[i]) {
                        vector.add(array[i]);
                        break;
                    }
                }
            } else {
                vector.add(-1);
                vector.add(-1);
            }
            if (vector.size() < 2) {
                vector.add(-1);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return vector;
    }

}
