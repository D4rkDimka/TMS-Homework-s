package Documents;

public class Main {
    public static void showMenu()
    {
        System.out.println("(1) - Add new document\n(2) - Display documents\n(3) - Find by document number\n(0) - Exit");
        System.out.println("\nYour choice>>");
    }


    public static void main(String[] args) {

        Register register = new Register();
        boolean isWorking = true;

        while(isWorking)
        {
            showMenu();
            int userChoice = register.getValue();

            switch (userChoice)
            {
                case 1:
                    register.addDocumentToRegister();
                    break;
                case 2:
                    if(register.isEmpty() == false) register.displayDocumentFromRegister();
                    else System.out.println("There is no elements in register!\n");
                    break;
                case 3:
                    if(register.isEmpty() == false) register.findDocumentInRegister();
                    else System.out.println("There is no elements in register!\n");
                    break;
                case 0:
                    isWorking = false;
                    break;
            }

        }






    }
}
