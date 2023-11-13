package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StockBuyAndSell2Test {

    @InjectMocks
    private StockBuyAndSell2 stockBuyAndSell2;

    @Test
    void stockBuyAndSellTest() {
    assertEquals(5,stockBuyAndSell2.stockBuyAndSell(4,new int[]{3, 4, 1, 5}));
    }
}