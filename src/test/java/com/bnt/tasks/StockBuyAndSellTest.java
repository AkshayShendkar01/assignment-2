package com.bnt.tasks;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StockBuyAndSellTest {

    @InjectMocks
    private StockBuyAndSell stockBuyAndSell;

    @Test
    void stockBuySellTest() {
        List<List> list = new ArrayList<>();
        list.add(Arrays.asList(new int[]{0,3}));
        list.add(Arrays.asList(new int[]{4,6}));
        List<ArrayList<Integer>> arrayLists = stockBuyAndSell.stockBuySell(new int[]{100, 180, 260, 310, 40, 535, 695});
        assertEquals(list,arrayLists);
    }
}