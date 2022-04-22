package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task_7();
    }

    public static void task_0() {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int counterOfElement = 0;

        fillArray(array);

        System.out.print("\nEnter element you would like to find: ");
        int userNumber = in.nextInt();

        boolean isFinded = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                isFinded = true;
                counterOfElement++;
            }
        }

        if (isFinded == true) {
            System.out.print("\nNumber " + userNumber + " exists in array x" + counterOfElement + " time(s)");
        } else System.out.println("Number" + userNumber + " doesn't exist in array!");

        in.close();
    }

    public static void task_1() {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

        int deleteNumber = 0;

        fillArray(array);
        displayArray(array);

        System.out.print("Enter element you would like to delete: ");
        deleteNumber = in.nextInt();
        int counter = 0;
        boolean isFinded = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteNumber) isFinded = true;
        }

        if (isFinded == true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != deleteNumber) {
                    counter++;
                }
            }


            int[] tempArray = new int[counter];
            int size = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != deleteNumber) {
                    tempArray[size] = array[i];
                    size++;
                }
            }
            array = tempArray;

            displayArray(array);
        } else System.out.println("There is no element " + deleteNumber + " in array!");
    }

    public static void task_2() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[0];

        System.out.println("Choose option:");
        System.out.printf("\n1) Create array with random size");
        System.out.print("\n2) Enter size of array");
        System.out.print("\n\nYour choice>> ");

        int userChoice = in.nextInt();

        switch (userChoice) {
            case 1:
                array = new int[random.nextInt(10) + 1];
                fillArray(array);
                break;
            case 2:
                System.out.print("Enter size of array: ");
                int sizeOfArray = in.nextInt();
                array = new int[sizeOfArray];
                fillArray(array);
                break;
            default:
                System.out.println("There is no choice with such input!");
                System.exit(0);
                break;
        }

        displayArray(array);

        int maxElement = array[0];
        int minElement = array[0];
        int middleValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) maxElement = array[i];
            if (array[i] < minElement) minElement = array[i];
            middleValue += array[i];
        }

        middleValue /= array.length;

        System.out.println("Max element in array is " + maxElement);
        System.out.println("Min element in array is " + minElement);
        System.out.println("Middle value is " + middleValue);

        in.close();
    }

    public static void task_3() {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        fillArray(firstArray);
        fillArray(secondArray);

        int firstArrayMiddleValue = 0;
        int secondArrayMiddleValue = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArrayMiddleValue += firstArray[i];
            secondArrayMiddleValue += secondArray[i];
        }
        displayArray(firstArray);
        System.out.println("First array middle value: " + firstArrayMiddleValue + "\n");
        displayArray(secondArray);
        System.out.println("Second array middle value: " + secondArrayMiddleValue);

        if (firstArrayMiddleValue > secondArrayMiddleValue) System.out.println("\nFirst array middle value is bigger");
        else if (firstArrayMiddleValue < secondArrayMiddleValue)
            System.out.println("\nSecond array middle value is bigger");
        else System.out.println("\nArrays are equal");

    }

    public static void task_4() {
        Scanner in = new Scanner(System.in);
        int[] firstArray;
        int[] secondArray;
        int sizeOfFirstArray = 0;
        int sizeOfSecondArray = 0;

        while (true) {
            System.out.print("Enter array of array(5 < size <= 10): ");
            sizeOfFirstArray = in.nextInt();

            if (sizeOfFirstArray > 5 && sizeOfFirstArray <= 10) {
                firstArray = new int[sizeOfFirstArray];
                fillArray(firstArray);
                break;
            } else System.out.println("\nThere incorrect input, try again");
        }

        displayArray(firstArray);

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                sizeOfSecondArray++;
            }
        }
        secondArray = new int[sizeOfSecondArray];
        int counter = 0;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] % 2 == 0) {
                secondArray[counter] = firstArray[i];
                counter++;
            }
        }

        if (sizeOfSecondArray == 0) System.out.println("There are no elements int second array!");
        else displayArray(secondArray);

        in.close();
    }

    public static void task_5() {
        Random random = new Random();
        int[] array = new int[random.nextInt(10)];
        fillArray(array);
        displayArray(array);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) array[i] = 0;
        }

        displayArray(array);
    }

    public static void task_6() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        String[] array = new String[random.nextInt(10)+5];

        System.out.println("Enter name's in array:");
        for (int i = 0; i<array.length;i++)
        {
            System.out.print(">>");
            array[i] = in.nextLine();
        }

        System.out.printf("[ ");
        for (int i = 0; i<array.length;i++)
        {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i] + " ");
        }
        System.out.println("]");

        Arrays.sort(array);

        System.out.printf("[ ");
        for (int i = 0; i<array.length;i++)
        {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i] + " ");
        }
        System.out.println("]");

        in.close();
    }

    public static void task_7(){
        Random random = new Random();
        int [] array = new int[random.nextInt(10)+5];
        fillArray(array);
        displayArray(array);

        for (int i = 0;i<array.length;i++)
        {
            for (int j = i+1;j< array.length-1;j++)
            {
                 if(array[i] > array[j])
                 {
                     int temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }
            }
        }

        displayArray(array);
    }

    public static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }

    }

    public static void displayArray(int[] array) {
        System.out.printf("[ ");
        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

}
