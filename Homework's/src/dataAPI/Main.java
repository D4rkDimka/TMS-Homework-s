package dataAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        boolean isWorking = true;
        Scanner in = new Scanner(System.in);
        HandleUserInput handleInput = new HandleUserInput();
        DateService dataService = new DateService();

        dataService.displayDayByDate(LocalDate.now(), LocalTime.now());
        dataService.displayDateAfterPeriod(7, LocalDate.now());

        Predicate<String> isValid = str -> {
            return str.length() != 0;
        };
        Predicate<Integer> isValidNumber = number -> {
            return number >= 0;
        };

        Consumer<String> process1 = str -> {
            System.out.print("Reverse of string " + str + " : ");
            char[] reverseStr = str.toCharArray();

            for (int i = reverseStr.length - 1; i >= 0; i--) {
                System.out.print(reverseStr[i]);
            }
            System.out.println();
        };

        Consumer<Integer> process2 = number -> {
            System.out.print("Factorial of " + number + ": ");
            int factorial = 1;
            if (number == 0) System.out.print(factorial);
            else {

                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                System.out.print(factorial);
            }

            System.out.println();
        };

        Consumer<String> processExit = str -> System.out.println("End of program");

        while (isWorking) {
            showMenu();
            String str = in.nextLine().toLowerCase(Locale.ROOT);

            if (str.equals("1")) {
                System.out.print("Enter string to reverse: ");
                String reverseString = in.nextLine();

                handleInput.handleUserStringInput(reverseString, isValid, process1);
            } else if (str.equals("2")) {
                System.out.print("Enter number to find factorial: ");
                int number = in.nextInt();

                handleInput.handleUserIntInput(number, isValidNumber, process2);
            } else if (str.equals("exit")) {
                System.out.println("Shut down of the program");
                isWorking = false;
            }
        }

    }

    public static void showMenu()
    {
        System.out.print("1) Reverse string" +
                "\n2) Find factorial" +
                "\nExit" +
                "\n\nYour choice>> ");
    }
}
