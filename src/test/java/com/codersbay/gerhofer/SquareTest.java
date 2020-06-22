package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    @DisplayName("When we create a shape with negative side length we expect to throw an IllegalArgumentException")
    public void testInvalidSideLengthException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Square(-2d);
        });
    }

    @Test
    @DisplayName("When we test getArea() with side length 2, expecting it to return 4")
    public void testGetArea() {
        Square testSquare = new Square(2);
        assertEquals(4, testSquare.getArea());
    }

    @Test
    @DisplayName("When we test getPerimeter() with side length 2, expeting it to return 8")
    public void testGetPerimeter() {
        Square testSquare = new Square(2);
        assertEquals(8, testSquare.getPerimeter());
    }
}
