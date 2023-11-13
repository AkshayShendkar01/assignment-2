package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GoodOrBadString {

    public int isGoodOrBad(String s) {

        int vowelCount = 0;
        int consonantCount = 0;
        String vowel = "aeiou";

        if(!s.contains("aeiou??")){
            List<Character> vowels = vowel.chars().mapToObj(value -> (char) value).collect(Collectors.toList());
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) {
                    vowelCount++;
                    if (consonantCount > 3) {
                        return 0;
                    }
                    consonantCount = 0;
                } else if (s.charAt(i) == '?') {
                    consonantCount++;
                    if (vowelCount > 5) {
                        return 0;
                    }
                    vowelCount = 0;
                }
            }
        }else {
            return 0;
        }
        return 1;
    }

}
