package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {
    public String series(int num) {
        int previous = 0;
        int next = 1;
        int i = 0;
        String series = "";
        while (i <= num) {
            series = series + previous + " ";
            int n1 = next + previous;
            previous = next;
            next = n1;
            i++;
        }
        return series;
    }


}
