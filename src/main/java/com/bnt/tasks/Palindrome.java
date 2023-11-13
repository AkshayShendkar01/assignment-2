package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {
    public String is_palindrome(int number) {

        String original = String.valueOf(number);
        StringBuilder s = new StringBuilder(original);
        String reverse = s.reverse().toString();

        return original.equals(reverse) ? "Yes" : "NO";
    }

    public String is_palindrome1(int number) {
        int r, sum = 0;
        int n = number;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return number == sum ? "Yes" : "NO";
    }

}
