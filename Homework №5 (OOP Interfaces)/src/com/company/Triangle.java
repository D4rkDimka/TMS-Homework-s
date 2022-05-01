package com.company;

import java.util.Scanner;

public class Triangle extends Figure{
    private double square;
    private double perimeter;
    private int amountOfSides;
    Triangle(){}

    Triangle(int amountOfSides,double square,double perimeter)
    {
        this.amountOfSides = amountOfSides;
        this.perimeter = perimeter;
        this.square = square;
    }

    @Override
    public void setAmountOfSides(int number) {
        this.amountOfSides = number;
    }

    @Override
    public void enterSides() {

        Scanner in = new Scanner(System.in);
        double [] sides = new double[amountOfSides];
        boolean isWorking = true;

        for (int i = 0; i <amountOfSides; i++)
        {
            isWorking = true;
            do{
                System.out.printf("Enter side>> ");
                if(!in.hasNextDouble())
                {
                    System.out.println("There is incorrect input!");
                    in.next();
                }
                else{
                    sides[i] = in.nextDouble();
                    isWorking = false;
                }

            }while(isWorking);
        }

    }

    @Override
    public double getSquare() {

        return 0;
    }

    @Override
    public double getPerimeter() {

        return 0;
    }
}
