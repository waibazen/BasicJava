package com.java.basic;

public class Rectangle implements Shapes {
    int length;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    int breadth;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return getLength()* getBreadth();
    }

    @Override
    public double sumLength() {
        return getLength()+getBreadth();
    }


}
