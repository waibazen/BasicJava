package com.java.basic;

public class Cube implements Shapes,MultiShapes{
    double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public double sumLength() {
        return 3*getLength();
    }

    @Override
    public double volume() {
        return Math.pow(getLength(),3);
    }
}
