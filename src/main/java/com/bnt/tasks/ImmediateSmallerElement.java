package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ImmediateSmallerElement {
    public int[] immediateSmaller(int[] num) {

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                num[i] = -1;
            }else {
                num[i]=num[i+1];
            }
        }
        num[num.length-1]=-1;
        return num;
    }

}
