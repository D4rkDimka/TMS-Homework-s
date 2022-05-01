package Figures;

import java.util.Scanner;

public class Circle extends Rectangle{
    private final double PI = 3.1415;
    private double radius;
    private double square;
    private double perimeter;

    Circle(){super();}

    Circle(double square,double perimeter, double radius) {
        super(square, perimeter);
        this.radius = radius;
    }

    @Override
    public void setValues(int diameter) {
        radius = diameter/2;
    }

    @Override
    public double findSquare() {

        this.square = PI*Math.pow(radius,2);
        System.out.printf("Square: %f\n",this.square);
        return this.square;
    }

    @Override
    public double findPerimeter() {
        this.perimeter = 2*PI*radius;
        System.out.printf("Perimeter: %f\n",this.perimeter);
        return this.perimeter;
    }

    @Override
    public double getPerimeter() {
       return this.perimeter;
    }
}
