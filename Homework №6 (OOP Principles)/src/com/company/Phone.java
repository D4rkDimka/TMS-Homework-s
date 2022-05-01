package com.company;

import java.util.Scanner;

public class Phone {
    private Integer number;
    private String model;
    private Double weight;

    public Phone() {}

    public Phone(Integer number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(Integer number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.printf("%s calls \n", callerName);
    }

    public void receiveCall(String callerName, Integer callerNumber) {
        System.out.printf("%s calls (%d)\n", callerName, callerNumber);
    }

    public void sendMessage(Integer [] phoneNumbers) {
        Scanner in = new Scanner(System.in);
        String [] messages = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length;i++)
        {
            System.out.printf("Enter message to number(%d): ", phoneNumbers[i]);
            String message = in.nextLine();
            messages[i] = message;
        }

        for (int i = 0; i< messages.length;i++)
        {
            System.out.printf("Message(%s) will be send to number %d\n",messages[i],phoneNumbers[i]);
        }
    }

    public Integer getNumber() {
        return number;
    }
}
