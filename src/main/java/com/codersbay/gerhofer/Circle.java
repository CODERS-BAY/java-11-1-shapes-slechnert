package com.codersbay.gerhofer;

public class Circle extends Shape {


    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can't be zero or negative!");
        }
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public double getPerimeter() {
        return (2 * radius) * Math.PI;
    }
}