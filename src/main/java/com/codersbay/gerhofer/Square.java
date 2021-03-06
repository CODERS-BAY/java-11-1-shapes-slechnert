package com.codersbay.gerhofer;

public class Square extends Rectangle {
    public double length;
    public double width;

    public Square(double length) {
        super(length, length);
        if (length <= 0) {
            throw new IllegalArgumentException("Side length can't be zero or negative");
        }
        this.length = length;
        this.width = length;
    }
}
