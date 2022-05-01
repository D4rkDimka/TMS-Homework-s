package Documents;

import java.util.Scanner;

public class Register {
    private Document[] documents;
    private static int counterOfDocument = 0;

    Register()
    {
        this.documents= new Document[10];
    }

    public void addDocumentToRegister() {
        Document document;

        System.out.println("Enter what type of document you would like to add to register: ");
        System.out.println("(1) - Contract for the supply of goods\n(2) - Contract with employees\n(3) - Financial invoice");
        System.out.println("\nYour choice>>");

        int userChoice = getValue();

        switch (userChoice)
        {
            case 1:
                document = new ContractForSupplyOfGoods();
                document.setDocument();
                break;
            case 2:
                document = new ContractWithEmployees();
                document.setDocument();
                break;
            case 3:
                document = new FinancialInvoice();
                document.setDocument();
                break;
            default:
                document = null;

        }
        if(counterOfDocument == 10)
        {
            System.out.println("Register is full!You can't add document more!");
        }
        else{
            documents[counterOfDocument] = document;
            counterOfDocument++;
        }
    }

    public void findDocumentInRegister() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter number of document you would like to find: ");

        if(in.hasNextInt())
        {
            int numberOfDocument = in.nextInt();

            for (int i = 0; i<this.documents.length;i++)
            {
                if(numberOfDocument == documents[i].getNumberOfDocument())
                {
                    documents[i].displayDocument();
                    System.out.println();
                }
                else System.out.println("There is no documents with such document number!\n");
            }
        }

    }

    public void displayDocumentFromRegister() {
        for (int i = 0; i<counterOfDocument;i++)
        {
            documents[i].displayDocument();
            System.out.println();
        }
    }

    public boolean isEmpty() {
        if(counterOfDocument == 0 )return true;
        else return false;
    }

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
