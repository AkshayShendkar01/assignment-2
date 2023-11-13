package com.bnt.tasks;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ThirdLargestElement {

    public int thirdLargest(int[] num){
        if(num.length>=3){
            List<Integer> list = Arrays.stream(num).boxed().sorted()
                    .distinct().collect(Collectors.toList());
            return list.size() >= 3 ? list.get(2) : -1;
        }else {
            return -1;
        }

    }

}
