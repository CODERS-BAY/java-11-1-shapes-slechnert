package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    @DisplayName("When we create a shape with negative side length we expect to throw an IllegalArgumentException")
    public void testInvalidSideLengthException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(2d, -2d);
        });
    }

    @ParameterizedTest
    @DisplayName("When we test getArea() with side lengths we expect em to be multiplied")
    @CsvSource({"2,4,8", "4,16, 64", "5000,3000,15000000"})
    public void testGetArea(double a, double b, double res) {
        Rectangle testRectangle = new Rectangle(a, b);
        assertEquals(res, testRectangle.getArea());
    }

    @ParameterizedTest
    @DisplayName("When we test getPerimeter() with side lengths we expect em to be added and multiplied by 2")
    @CsvSource({"2,4,12", "4,16, 40", "5000,3000,16000"})
    public void testGetPerimeter(double a, double b, double res) {
        Rectangle testRectangle = new Rectangle(a, b);
        assertEquals(res, testRectangle.getPerimeter());
    }
}
