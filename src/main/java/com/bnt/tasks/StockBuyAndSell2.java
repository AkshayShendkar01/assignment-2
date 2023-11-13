package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class StockBuyAndSell2 {
    public int stockBuyAndSell(int n,int[] arg){
        int maxProfit = 0;
        for (int i = 0; i < n-1; i++) {
            if (arg[i] < arg[i + 1]) {
                maxProfit += arg[i + 1]- arg[i];
            }
        }
        return maxProfit;
    }
}
