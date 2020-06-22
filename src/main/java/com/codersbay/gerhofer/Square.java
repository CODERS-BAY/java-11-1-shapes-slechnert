package com.codersbay.gerhofer;

public class Square extends Shape {
    public double sideLength;

    public Square(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length can't be zero or negative");
        }
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
}
