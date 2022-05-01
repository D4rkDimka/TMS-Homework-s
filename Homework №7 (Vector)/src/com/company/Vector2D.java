package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector {
    private int x;
    private int y;
    private final String  capacity ="This vector for "

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double findVectorLength() {
        double length = sqrt(pow(this.x, 2) + pow(this.y, 2));
        return length;
    }

    public int findScalarProduct(Vector vector) {
        int scalarProduct = this.x + vector.getX() + this.y + vector.getY();
        return scalarProduct;
    }

    public Vector vectorsSum(Vector vector) {
        Vector resultedVector = new Vector(0, 0);

        resultedVector.setX(this.x + vector.getX());
        resultedVector.setY(this.y + vector.getY());

        return resultedVector;
    }

    public Vector vectorsDifference(Vector vector) {
        Vector resultedVector = new Vector(0, 0);

        if (this.x > vector.getX()) resultedVector.setX(this.x - vector.getX());
        else resultedVector.setX(vector.getX() - this.x);

        if (this.y > vector.getY()) resultedVector.setY(this.y - vector.getY());
        else resultedVector.setY(vector.getY() - this.y);

        return resultedVector;
    }

    public static Vector[] createArrayOfVectors(int amount) {
        Vector[] vectors = new Vector[amount];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < vectors.length; i++) {
            System.out.println("Enter x: ");
            int x = in.nextInt();
            System.out.println("Enter y: ");
            int y = in.nextInt();
            System.out.println();
            vectors[i] = new Vector(x, y);
        }
        return vectors;
    }

    public boolean compareVectors(Vector vector) {
        if (this.x > vector.getX() && this.y > vector.getY()) {
            System.out.println("First vector bigger than second");
            return true;
        } else if (this.x < vector.getX() && this.y < vector.getY()) {
            System.out.println("First vector less than second");
            return false;
        } else {
            System.out.println("Vectors are equal");
            return false;
        }
    }

    public void displayVector()
    {
        System.out.printf("[X = %d Y = %d]\n",this.x,this.y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
