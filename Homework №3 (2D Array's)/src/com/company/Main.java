package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    task_3();
    }

    public static void task_1() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[][][] array = new int[3][3][3];
        int userNumber = 0;
        boolean isWorking = true;

        while (isWorking) {
            System.out.print("Enter number: ");

            while (!in.hasNextInt()) {
                System.out.print("\nIncorrect input,try again.Enter number: ");
                in.next();
            }

            userNumber = in.nextInt();

            if (userNumber <= 0) System.out.println("Your input less or  equal 0, incorrect input!");
            else isWorking = false;
        }

        fillArray(array);
        displayArray(array);
        System.out.println("\n=============================================================================");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += userNumber;
                }
            }
        }
        displayArray(array);

    }

    public static void task_2() {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) array[i][j] = "W";
                else array[i][j] = "B";
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Не понимаю,почему тут ругается)
    public static void task_3() {
        int[][] firstArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondArray = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int amountOfColumns = firstArray[0].length;
        int amountOfString = secondArray.length;

        boolean isEqual = false;

        int[][] resultedMatrix = new int[firstArray.length][secondArray[0].length];

        if (amountOfString == amountOfColumns)

            for (int i = 0; i < resultedMatrix.length; i++) {
                for (int j = 0; j < resultedMatrix[i].length; j++) {
                    for (int k = 0; k < resultedMatrix.length; k++) {
                        resultedMatrix[i][j] += firstArray[i][k] * secondArray[k][j];
                    }
                }
            }

        System.out.print("[");

        for (int i = 0; i < resultedMatrix.length; i++) {
            for (int j = 0; j < resultedMatrix[i].length; j++) {
                System.out.print(resultedMatrix[i][j] + " ");
            }
        }
        System.out.print("]");
    }

    public static void task_4() {
        Random random = new Random();
        int[][] array = new int[3][3];

        int sumOfAllElements = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 3;
                sumOfAllElements += array[i][j];
            }
        }

        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.print("]");

        System.out.println(" Sum of all elements: " + sumOfAllElements);
    }

    public static void task_5() {
        Random random = new Random();
        int[][] array = new int[3][3];

        int sumOfAllElements = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 3;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println("\nSide diagonal: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
    }

    public static void task_6() {
        Random random = new Random();
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 3;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void displayArray(int[][][] array) {
        System.out.print("[ | ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
            }
            System.out.print(" | ");
        }

        System.out.print("]");
    }

    public static void fillArray(int[][][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(15) + 1;
                }
            }
        }
    }
}
