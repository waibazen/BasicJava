package com.java.basic;

import java.util.List;

public class AreaCalculator implements IAreaCalculator,DimCalculator {

    @Override
    public int sumArea(List<Shapes> shapes) {//get the interface type now any extension of shapes is handled by interface
        int sum = 0;
        double volume = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shapes shape = shapes.get(i);
            //THIS VIOLATE SOLID PRINCIPLE OPEN CLOSE AS WE ADD DIFFERNET SHAPES OUR CLASS HAS TO BE MODIFIED
            //INSTEAD WE JUST NEED AN EXTENSION SO WELL USE INTERFACE
            /*if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if(shape instanceof Rectangle){
                sum+= ((Rectangle) shape).getLength()* ((Rectangle) shape).getBreadth();
            }*/

            sum += shape.area();
        }
        return sum;
    }

    @Override
    public double sumVolume(List<MultiShapes> shapes) {
        double volume = 0;
        for (int i = 0; i < shapes.size(); i++) {
            MultiShapes shape = shapes.get(i);
            volume += shape.volume();


        }
        return volume;
    }


    @Override
    public double sumLength(List<Shapes> shapes) {
        double length = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shapes shape = shapes.get(i);
            length += shape.sumLength();


        }
        return length;


    }

}
