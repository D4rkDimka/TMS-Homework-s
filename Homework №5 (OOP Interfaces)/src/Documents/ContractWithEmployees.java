package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContractWithEmployees extends Document{
    private int numberOfDocument;
    private Date dateOfDocument;
    private Date contractEndDate;
    private String nameOfEmployee;

    ContractWithEmployees(){}

    ContractWithEmployees(int numberOfDocument, String nameOfEmployee) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = new Date();
        this.contractEndDate = new Date(2022,8,23);
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public void setDocument() {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of document: ");
        this.numberOfDocument = getValue();
        System.out.println();

        this.dateOfDocument = new Date();

        this.contractEndDate = new Date(2022,8,23);

        System.out.print("Enter name of employee: ");
        this.nameOfEmployee = in.nextLine();
        System.out.println();
    }

    @Override
    public void displayDocument() {
        System.out.printf("Number of document: %d\n",this.numberOfDocument);
        System.out.println("Date of document: "+ dateOfDocument.toString());
        System.out.println("Contract end of document: "+ contractEndDate.toString());
        System.out.printf("Name of employee: %s\n", this.nameOfEmployee);
    }

    @Override
    public int getNumberOfDocument() {
        return this.numberOfDocument;
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
