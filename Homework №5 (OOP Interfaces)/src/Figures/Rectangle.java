package Figures;

import java.util.Scanner;

public class Rectangle extends Triangle{
    private double square;
    private double perimeter;
    private double[] sides;

    Rectangle() {
        super();
    }
    Rectangle(double square, double perimeter) {
        super(square, perimeter);
    }

    @Override
    public double findSquare() {
        this.square = sides[0]*sides[1];
        System.out.printf("Square: %f\n",this.square);
        return this.square;
    }

    @Override
    public double findPerimeter() {
        for (int i = 0;i <sides.length;i++)
        {
            this.perimeter +=sides[i];
        }
        this.perimeter*=2;

        System.out.printf("Perimeter: %f\n",this.perimeter);
        return this.perimeter;

    }

    @Override
    public void setValues(int amountOfSides) {

        this.sides = new double[amountOfSides];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < sides.length;i++)
        {
            int numberOfSide = i+1;
            do {
                System.out.print("Please enter value of " + numberOfSide +" sides:");
                while (!in.hasNextDouble()) {
                    System.out.println("That not a number!");
                    in.next();
                }
                sides[i] = in.nextDouble();
            } while (sides[i] <= 0);
        }
        in.close();
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
}
