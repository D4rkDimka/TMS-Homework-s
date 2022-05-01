package Documents;

import java.util.Date;
import java.util.Scanner;

public class ContractForSupplyOfGoods extends Document{
    private int numberOfDocument;
    private String typeOfGood;
    private int amountOfGoods;
    private Date dateOfDocument;

    ContractForSupplyOfGoods(){}

    ContractForSupplyOfGoods(int numberOfDocument, String typeOfGood, int amountOfGoods, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.typeOfGood = typeOfGood;
        this.amountOfGoods = amountOfGoods;
        this.dateOfDocument = dateOfDocument;
    }

    @Override
    public void setDocument() {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of document: ");
        this.numberOfDocument = getValue();
        System.out.println();

        System.out.print("Enter type of good: ");
        this.typeOfGood = in.nextLine();
        System.out.println();

        System.out.print("Amount of goods: ");
        this.amountOfGoods = getValue();
        System.out.println();

        this.dateOfDocument = new Date();
    }

    @Override
    public void displayDocument() {
        System.out.printf("Number of document: %d\n",this.numberOfDocument);
        System.out.printf("Type of good: %s\n",this.typeOfGood);
        System.out.printf("Amount of goods: %d\n",this.amountOfGoods);
        System.out.println("Date of document: "+ this.dateOfDocument.toString());
    }

    @Override
    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    @Override
    public int getValue() {
        Scanner in = new Scanner(System.in);
        int userValue;

        do {
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next();
            }
            userValue = in.nextInt();
        } while (userValue <= 0);

        return userValue;
    }
}
