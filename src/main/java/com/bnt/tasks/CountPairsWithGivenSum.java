package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class CountPairsWithGivenSum {
    public int getPairsCount(int arr[], int n, int k) {
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i]+arr[j]==k){
                    pairs++;
                }
            }
        }
        return pairs;

    }


}
