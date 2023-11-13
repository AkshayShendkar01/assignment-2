package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Factorial {

    public int factorial(int number) {
        int i = 2;
        int factorial = 1;
        if (number >= 0) {
            while (i <= number) {
                factorial *= i;
                i++;
            }
        } else {
            System.out.println("number is negative");
        }
        return factorial;
    }

}

