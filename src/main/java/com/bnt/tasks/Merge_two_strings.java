package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class Merge_two_strings {

    public String merge(String s1, String s2) {

        String max = s1.length() >= s2.length() ? s1 : s2;
        String min = s2.length() <= s1.length() ? s2 : s1;
        String mergeString = "";
        for (int i = 0; i < min.length(); i++) {
            mergeString += max.charAt(i);
            mergeString += min.charAt(i);
        }
        if (max.length() != min.length()) {
            mergeString += max.substring(min.length());
        }
        return mergeString;
    }

}
