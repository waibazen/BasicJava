package com.java.basic;

import java.util.List;

public class DimensionCalculator implements DimCalculator{
    @Override
    public double sumLength(List<Shapes> shapes) {
    double length = 0;
    for (int i = 0; i < shapes.size(); i++) {
        Shapes shape = shapes.get(i);
        length += shape.sumLength();


    }
    return length;


}


    @Override
    public int sumArea(List<Shapes> shapes) {
        return 0;
    }

    @Override
    public double sumVolume(List<MultiShapes> shapes) {
        return 0;
    }
}
