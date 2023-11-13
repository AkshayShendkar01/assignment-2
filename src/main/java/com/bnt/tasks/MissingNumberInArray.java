package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MissingNumberInArray {
    public int missingNumber(int[] arr,int n){
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n;
    }

}
