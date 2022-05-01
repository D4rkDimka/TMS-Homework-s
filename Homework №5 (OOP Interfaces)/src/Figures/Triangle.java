package Figures;

import java.util.Scanner;

public class Triangle extends Figure{
    private double square;
    private double perimeter;
    private double[] sides;

    Triangle(){}
    Triangle(double square, double perimeter)
    {
        this.perimeter = perimeter;
        this.square = square;
    }

    @Override
    public double findSquare() {
        double halfPerimeter = getPerimeter()/2;
        this.square = Math.sqrt(halfPerimeter* (halfPerimeter-sides[0]) * (halfPerimeter- sides[1]) * (halfPerimeter-sides[2]));

        System.out.printf("Square: %f\n",this.square);
        return this.square;
    }

    @Override
    public double findPerimeter() {
        for (int i = 0;i <sides.length;i++)
        {
            this.perimeter +=sides[i];
        }
        System.out.printf("Perimeter: %f\n",this.perimeter);
        return this.perimeter;
    }

    public void setValues(int amountOfSides) {

        this.sides = new double[amountOfSides];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<sides.length;i++)
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

    public double getPerimeter() {
        return perimeter;
    }
}
