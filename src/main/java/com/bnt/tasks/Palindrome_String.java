package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Palindrome_String {
    public int isPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString().equals(string) ? 1 : 0;
    }


}
