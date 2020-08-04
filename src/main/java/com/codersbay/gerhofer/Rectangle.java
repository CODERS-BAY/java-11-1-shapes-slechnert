package com.codersbay.gerhofer;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Side length can't be zero or negative");
        }
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}