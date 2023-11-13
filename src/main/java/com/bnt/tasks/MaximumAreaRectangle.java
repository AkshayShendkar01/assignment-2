package com.bnt.tasks;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MaximumAreaRectangle {
   public int  calculate_Area(Rectangle[] rectangles){

       List<Rectangle> rectanglesList = Arrays.asList(rectangles);
       Optional<Integer> max =
               rectanglesList.stream()
               .map(rectangle -> rectangle.area())
               .max(Integer::compareTo);

       return max.get();
    }

}
