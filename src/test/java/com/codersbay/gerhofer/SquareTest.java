package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @ParameterizedTest
    @DisplayName("When we create a shape with negative side length we expect to throw an IllegalArgumentException")
    @ValueSource(doubles = {-2d, 0d})
    public void testInvalidSideLengthException(double num) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Square(num);
        });
    }

    @ParameterizedTest
    @DisplayName("When we test getArea(), we expect the sidelength to be  squared")
    @CsvSource({"2,4", "4,16", "5000,25000000"})
    public void testGetArea(double num, double res) {
        Square testSquare = new Square(num);
        assertEquals(res, testSquare.getArea());
    }

    @ParameterizedTest
    @DisplayName("When we test getPerimeter(), we expect it to multiply by 4")
    @CsvSource({"2,8", "4,16", "5000,20000"})
    public void testGetPerimeter(double num, double res) {
        Square testSquare = new Square(num);
        assertEquals(res, testSquare.getPerimeter());
    }
}
