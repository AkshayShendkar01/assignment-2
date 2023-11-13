package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class CheckForSubsequence {
    int isSubSequence(String a, String b) {
        int j = 0;
        if (b.length() >= a.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (j < a.length() && b.charAt(i) == a.charAt(j)) {
                    j++;
                }
            }
        }
        return a.length() == j ? 1 : 0;
    }


}
