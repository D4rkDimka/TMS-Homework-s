package Documents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FinancialInvoice extends Document{
    private int contractForSupplyOfGoods;
    private Date dateOfDocument;
    private int numberOfDocument;
    private int departmentCode;

    FinancialInvoice(){}

    FinancialInvoice(int contractForSupplyOfGoods, int numberOfDocument, int departmentCode) {
        this.contractForSupplyOfGoods = contractForSupplyOfGoods;
        this.dateOfDocument = new Date();
        this.numberOfDocument = numberOfDocument;
        this.departmentCode = departmentCode;
    }

    @Override
    public void setDocument() {

        System.out.print("Enter contract for supply of goods: ");
        this.contractForSupplyOfGoods = getValue();
        System.out.println();

        this.dateOfDocument = new Date();

        System.out.print("Number of document: ");
        this.numberOfDocument = getValue();
        System.out.println();

        System.out.print("Enter Department code: ");
        this.departmentCode = getValue();
        System.out.println();
    }

    @Override
    public void displayDocument() {
        System.out.printf("Contract for supply of goods: %d\n",this.contractForSupplyOfGoods);
        System.out.println("Date of document: "+ dateOfDocument.toString());
        System.out.printf("Number of document: %d\n", this.numberOfDocument);
        System.out.printf("Department code: %d\n", this.departmentCode);

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
