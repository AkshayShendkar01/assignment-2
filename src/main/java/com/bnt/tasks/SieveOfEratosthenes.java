package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SieveOfEratosthenes {

    List<Integer> sieveOfEratosthenes(int n) {

        IntStream intStream = IntStream.rangeClosed(2, n);
        List<Integer> collect =
                intStream.filter(value -> {
                            int i = 2;
                            while (i < (value/2)) {
                                if (value % i == 0)
                                    return false;
                                i++;
                            }
                            return true;
                        })
                        .boxed().collect(Collectors.toList());
        return collect;
    }

}
