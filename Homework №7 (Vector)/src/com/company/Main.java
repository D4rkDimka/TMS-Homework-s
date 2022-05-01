package com.company;

public class Main {

    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(1,1);
        Vector2D vector2D1 = new Vector2D(2,2);

        vector2D.displayVector();
        vector2D1.displayVector();

        vector2D.compareVectors(vector2D1);

        System.out.println("Scalar product: "+ vector2D.findScalarProduct(vector2D1));
        System.out.println("Vector length: "+ vector2D.findVectorLength());
        System.out.println("Vector1 length: "+ vector2D1.findVectorLength());

        vector2D = vector2D.vectorsSum(vector2D1);
        System.out.print("Vectors sum = ");
        vector2D.displayVector();

        vector2D = vector2D.vectorsDifference(vector2D1);
        System.out.print("Vectors difference = ");
        vector2D.displayVector();

        System.out.println("====================================");

        Vector3D vector3D = new Vector3D(1,1,1);
        Vector3D vector3D1 = new Vector3D(2,2,2);

        vector3D.displayVector();
        vector3D1.displayVector();

        vector3D.compareVectors(vector3D1);

        System.out.println("Scalar product: "+ vector3D.findScalarProduct(vector3D1));
        System.out.println("Vector length: "+ vector3D.findVectorLength());
        System.out.println("Vector1 length: "+ vector3D1.findVectorLength());

        vector3D = vector3D.vectorsSum(vector3D1);
        System.out.print("Vectors sum = ");
        vector3D.displayVector();

        vector3D = vector3D.vectorsDifference(vector3D1);
        System.out.print("Vectors difference = ");
        vector3D.displayVector();

    }
}
