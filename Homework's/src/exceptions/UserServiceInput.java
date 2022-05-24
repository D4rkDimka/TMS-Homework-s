package exceptions;

import java.util.List;
import java.util.Scanner;

public class UserServiceInput {
    private List<String> stringList;

    public UserServiceInput(List<String> stringsList) {
        this.stringList = stringsList;
    }

    public void ServiceInput() {
        Scanner in = new Scanner(System.in);
        HandleUserInput handleUserInput = new HandleUserInput();
        boolean isWorking = true;

        while (isWorking) {
            System.out.print("Enter your massage: ");
            String userInput = in.nextLine();

            try {
                isWorking = handleUserInput.HandleInput(userInput, stringList);
            } catch (UserMemoryIsEmptyCheckException exception) {
                System.out.println(exception.getMessage());
                break;

            } catch (UserMemoryIsFullException exception) {
                System.out.println(exception.getMessage());
                boolean isReadyToContinue = true;

                while (isReadyToContinue) {
                    System.out.println("To continue you need to clear memory with help of command (get)");
                    System.out.print(">> ");
                    userInput = in.nextLine();
                    if (userInput.equals("get")) {
                        isReadyToContinue = false;
                        System.out.println("First element in list was - " + stringList.get(0));
                        stringList.remove(0);
                    }
                }
            }
            if (!userInput.equals("get") && !userInput.equals("exit")) {
                stringList.add(userInput);
            }
        }
    }

}
