package com.java.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       IAreaCalculator areaCalculator=new AreaCalculator();//dependency inversion
        //components should depend on abstractions (interface) not concretions SOLID

       Square square=new Square(10);
       Rectangle rectangle=new Rectangle(10,20);
       MisUtils misUtils=new MisUtils();

       List<Shapes>shapeList= new ArrayList<>();
       shapeList.add(square);
       shapeList.add(rectangle);

       int sum= areaCalculator.sumArea(shapeList);

       DimCalculator dimCalculator=new DimensionCalculator();
       double sumLength=dimCalculator.sumLength(shapeList);



        System.out.println(sum);
        System.out.println(sumLength);
        System.out.println(misUtils.json(sum));




    }


}
