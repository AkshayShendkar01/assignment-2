package com.bnt.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MaximumAreaRectangleTest {

    @InjectMocks
    MaximumAreaRectangle maximumAreaRectangle;

    @Test
    void calculate_Area() {
        Rectangle[] rectangles = new  Rectangle[]{
                new Rectangle(12,3),
                new Rectangle(40,5),

        };
        assertEquals(200,maximumAreaRectangle.calculate_Area(rectangles));
    }
}