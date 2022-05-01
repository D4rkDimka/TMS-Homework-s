package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vector3D extends Vector2D{
    private int z;
    private final String capacity = "This vector for three-dimensional coordinate system";

    public Vector3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public double findVectorLength() {
        double length = sqrt(pow(super.getX(), 2) + pow(super.getY(), 2) + pow(this.z,2));
        return length;
    }

    public int findScalarProduct(Vector3D vector) {
        int scalarProduct = super.getX() + vector.getX() + super.getY() + vector.getY() + this.z + vector.getZ();
        return scalarProduct;
    }

    public Vector3D vectorsSum(Vector3D vector) {
        Vector3D resultedVector = new Vector3D(0, 0,0);

        resultedVector.setX(super.getX() + vector.getX());
        resultedVector.setY(super.getY() + vector.getY());
        resultedVector.setZ(this.z + vector.getZ());

        return resultedVector;
    }

    public Vector3D vectorsDifference(Vector3D vector) {
        Vector3D resultedVector = new Vector3D(0, 0,0);

        if (super.getX() > vector.getX()) resultedVector.setX(super.getX() - vector.getX());
        else resultedVector.setX(vector.getX() -super.getX());

        if (super.getY() > vector.getY()) resultedVector.setY(super.getY() - vector.getY());
        else resultedVector.setY(vector.getY() -super.getY());

        if (this.z > vector.getZ()) resultedVector.setZ(this.z - vector.getZ());
        else resultedVector.setZ(vector.getZ() - this.z);

        return resultedVector;
    }

    public boolean compareVectors(Vector3D vector) {
        if (super.getX() > vector.getX() && super.getY() > vector.getY() && this.z > vector.getZ()) {
            System.out.println("First vector bigger than second");
            return true;
        } else if (super.getX() < vector.getX() && super.getY() < vector.getY()&& this.z < vector.getZ()) {
            System.out.println("First vector less than second");
            return false;
        } else {
            System.out.println("Vectors are equal");
            return false;
        }
    }

    public static Vector3D[] createArrayOfVectors(int amount) {
        Vector3D[] vectors = new Vector3D[amount];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < vectors.length; i++) {
            System.out.println("Enter x: ");
            int x = in.nextInt();
            System.out.println("Enter y: ");
            int y = in.nextInt();
            System.out.println("Enter z: ");
            int z = in.nextInt();
            System.out.println();
            vectors[i] = new Vector3D(x, y, z);
        }
        return vectors;
    }

    @Override
    public void displayVector() {
        System.out.printf("[X = %d, Y = %d, Z = %d]\n",super.getX(),super.getY(),this.z);
        System.out.println(capacity);
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public int getZ() {
        return z;
    }
}
