package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Component
public class AnagramOfString {
    int remAnagram(String s1, String s2) {
        int needsToDelete = 0;
        List<Character> s1List = Stream.of(s1)
                .flatMap(s -> s.chars().mapToObj(value -> (char) value))
                .collect(Collectors.toList());

        List<Character> s2List = Stream.of(s2)
                .flatMap(s -> s.chars().mapToObj(value -> (char) value))
                .collect(Collectors.toList());

        return s1List.containsAll(s2List)?s1List.size()-s2List.size():-1;
    }


}
