package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @ParameterizedTest
    @DisplayName("When we create a shape with negative side length we expect to throw an IllegalArgumentException")
    @ValueSource(doubles = {-2d, 0d})
    public void testInvalidRadiusException(double num) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(num);
        });
    }

    @Test
    @DisplayName("getArea calculates the area of the circle")
    public void testGetArea() {
        Circle testCircle = new Circle(2);
        assertEquals(12.566370614359172, testCircle.getArea());
    }

    @Test
    @DisplayName("getPerimeter calculates the perimeter of the circle")
    public void testGetPerimeter() {
        Circle testCircle = new Circle(2);
        assertEquals(12.566370614359172, testCircle.getArea());
    }
}
