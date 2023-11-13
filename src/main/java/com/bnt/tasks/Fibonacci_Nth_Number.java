package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci_Nth_Number {
    public int nthFibonacci(int num) {
        int previous = 0;
        int next = 1;
        int i = 0;
        int nthNumber = 0;
        while (i <= num) {
            nthNumber = previous;
            int n1 = next + previous;
            previous = next;
            next = n1;
            i++;
        }
        return nthNumber;
    }

}
