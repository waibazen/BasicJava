package com.java.basic;

public class Square implements Shapes{
    int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return (int) Math.pow(getLength(), 2);
    }

    @Override
    public double sumLength() {
        return getLength()*4;
    }
}
