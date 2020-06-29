package com.codersbay.gerhofer;

public class Square extends Rectangle {
    public double length;
    public double width;

    public Square(double length, double width) {
        super(length, width);
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Side length can't be zero or negative");
        }
        this.length = length;
        this.width = length;
    }

}
