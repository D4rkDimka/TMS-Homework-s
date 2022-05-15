package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Service {
    public boolean findCertainEmployee(Director director) {
        Employee[] employees = director.getArrayOfWorkers();
        Employee[] tempEmployees = new Employee[0];
        Scanner in = new Scanner(System.in);
        boolean isFound = false;
        System.out.print("Enter name of employee you'd like to find: ");
        String searchName = in.nextLine();
        int counter = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Director) {
                tempEmployees = ((Director) employees[i]).getArrayOfWorkers();
                for (int j = 0; j < tempEmployees.length; j++) {
                    employees[counter++] = tempEmployees[j];
                }
            }
            counter++;
        }

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().toLowerCase(Locale.ROOT) == searchName.toLowerCase(Locale.ROOT)) isFound = true;
        }

        in.close();
        return isFound;
    }

}