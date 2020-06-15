package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @Test
    @DisplayName("When we enter 0 or negative radii, we expect an error")

    public void testInvalidRadiusException() {
        Circle testCircle = new Circle(-2.00);
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(-2d);
        });


    }
}
