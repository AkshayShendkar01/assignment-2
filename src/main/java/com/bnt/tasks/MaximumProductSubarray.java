package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class MaximumProductSubarray {

    public long maxProduct(int[] arr, int n) {
        long previousProduct = arr[0];
        long nextProduct = 0;
        for (int i = 1; i < n - 1; i++) {
            previousProduct = previousProduct * arr[i];
            if (nextProduct < previousProduct) {
                nextProduct = previousProduct;
            }else {
                previousProduct =arr[i];
            }
        }
        return nextProduct;
    }

}
