package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @Test
    @DisplayName("When we test getArea() with side length 2 and width 2, we expect it to return 4")
    public void testGetArea() {
        Rectangle testRectangle = new Rectangle(2, 2);
        assertEquals(4, testRectangle.getArea());
    }

    @Test
    @DisplayName("When we test getPerimeter() with side length 2 and width 2, we expect it to return 8")
    public void testGetPerimeter() {
        Rectangle testRectangle = new Rectangle(2, 2);
        assertEquals(8, testRectangle.getPerimeter());
    }
}
