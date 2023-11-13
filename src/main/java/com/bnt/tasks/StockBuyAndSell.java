package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockBuyAndSell {
    public List<ArrayList<Integer>> stockBuySell(int[] arg) {

        List<ArrayList<Integer>> buySellList = new ArrayList<>();
        int buy = 0;
        int sell = 0;
        for (int i = 0; i < arg.length - 1; i++) {
            if (arg[i + 1] > arg[i]) {
                sell++;
            } else {
                if (sell > buy) {
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(buy);
                    li.add(sell);
                    buySellList.add(li);
                }
                buy = i + 1;
                sell = i + 1;
            }
        }
        if (sell > buy) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(buy);
            list.add(sell);
            buySellList.add(list);
        }
        return buySellList;

    }

}