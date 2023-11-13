package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ConvertArrayIntoZigZagFashion {
    public int[] zigZag(int[] array) {
        int[] zigZagArray = new int[array.length];
        int j = array.length - 1;
        int zF=0;
        int zN =1;
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
                zigZagArray[zF] = array[i];
                zigZagArray[zN] = array[j];
            j--;
            zF+=2;
            zN+=2;
        }

        if(array.length%2 !=0){
            zigZagArray[array.length-1]=array[array.length/2];
        }

        return zigZagArray;
    }


}
