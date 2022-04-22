package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static void DisplayMonths()
    {
        Scanner in = new Scanner(System.in);
        String nameOfMonth = "";

        System.out.print("Enter number of month you would like to see: ");
        int numberOfMonth = in.nextInt();

        switch (numberOfMonth)
        {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                System.out.println("\nThere is no case with such input!\n");
        }

        System.out.println("Season with number "+numberOfMonth+" - " + nameOfMonth);

    }

    public static void DisplaySeason()
    {
        Scanner in = new Scanner(System.in);
        int numberOfMonth;

        while  (true)
        {
            System.out.print("Enter number of month: ");
            numberOfMonth = in.nextInt();
            if(numberOfMonth >0 && numberOfMonth <13) break;
            else System.out.print("\nThere is incorrect input, try again!\n");
        }

        if( numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11) System.out.print("\nSeason is Autumn\n");
        else if( numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2) System.out.print("\nSeason is Winter\n");
        else if( numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) System.out.print("\nSeason is Spring\n");
        else if(numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8 ) System.out.print("Season is Summer");
    }

    public static void GetEvenNumber()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = in.nextInt();

        if(number %2 == 0) System.out.print("\nNumber is even!");
        else System.out.print("\nNumber is odd!");
    }

    public static void GetTemperature()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your temperature: ");
        int temperature = in.nextInt();

        if(temperature >-5) System.out.println("Warm");
        else if(temperature >=-5 && temperature <-20) System.out.println("Normal");
        else if(temperature <=-20) System.out.println("Cold");
    }

    public static void GetColorOfRainbow()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int numberOfColor = in.nextInt();

        switch (numberOfColor)
        {
            case 1:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+ " is Red");
                break;
            case 2:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+ " is Orange");
                break;
            case 3:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+" is Yellow");
                break;
            case 4:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+" is Green");
                break;
            case 5:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+" is Blue");
                break;
            case 6:
                System.out.print("\nColor in rainbow with number "+ numberOfColor+" is Purple");
                break;
            default:
                System.out.println("There is no case with such input!");
                break;
        }
    }

    public static void DisplayOddNumbers()
    {
        for (int i = 0; i < 100 ; i++)
        {
            if(i % 2 == 1) System.out.print(i + " ");
        }
    }

    public static void DisplayFrom5To1()
    {
        for (int i = 5; i > 0; i--)
        {
            System.out.print(i+" ");
        }
    }

    public static void FindSumToCertainNumber()
    {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while(true)
        {
            System.out.print("Enter your number: ");
            number = in.nextInt();

            if(number < 0) System.out.println("There is incorrect input (<0), try again!");
            else break;
        }

        for(int i = 1; i < number; i++)
        {
            sum+=i;
        }

        System.out.println("Sum from 1 to "+ number+" = "+sum);
    }

    public static void DisplayRawWithStep7()
    {
        for (int i = 0; i< 100; i+=7)
        {
            System.out.print(i +" ");
        }

    }

    public static void DisplayRawWithStep5()
    {
        int sum = 0;

        for (int i = 0; i < 10; i++)
        {
            System.out.print(sum +" ");
            sum-=5;
        }

    }

    public static void FunctionPow()
    {
        long number;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        number = in.nextInt();

        System.out.printf("Square number of "+ number +" = "+ Math.pow(number,2));
    }

    public static void Fibonachi()
    {
        int firstNumber = 1;
        int secondNumber = 1;
        int result;

        System.out.print(firstNumber+" "+secondNumber+" ");

        for(int i = 3; i <= 11; i++)
        {
            result = firstNumber + secondNumber;

            System.out.print(result+" ");

            firstNumber = secondNumber;
            secondNumber = result;
        }

        System.out.println();
    }

    public static void InterestRate()
    {
        Scanner in = new Scanner(System.in);

        double depositAmount;
        int amountOfMonths;
        double interestRate = 0.07;
        double resultedSum = 0;

        System.out.print("Enter deposit amount: ");
        depositAmount = in.nextDouble();

        System.out.print("Enter amount of months: ");
        amountOfMonths = in.nextInt();

        resultedSum+= depositAmount+(depositAmount*interestRate);

        for (int i = 0; i < amountOfMonths-1; i++)
        {
            resultedSum+= depositAmount*interestRate;
        }

        System.out.println("Result sum = " + resultedSum);
    }

    public static void DisplayMultiplicationTable()
    {
        for (int i = 1; i<=10; i++)
        {
            for (int j = 1; j<=10; j++)
            {
                System.out.print(i + " * " + j + " = "+  i*j + "\t");
            }
            System.out.println();
        }
    }

}
