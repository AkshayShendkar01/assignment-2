package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class KthSmallestElement {
    public Integer kthSmallest(int[] arr , int k){

        Arrays.sort(arr);
        try {
            int element = arr[k-1];
            return element;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
