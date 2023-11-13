package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class PrimeNumber {

    public int isPrime(int number) {
        for (int i = 2; i < (number/2); i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;

    }

}
