package exceptions;

import java.util.List;
import java.util.Locale;

public class HandleUserInput {

    public boolean HandleInput(String userInput, List<String> stringList) {
        boolean isWorking = true;
        int maxAmountOfElements = 5;

        if (userInput.toLowerCase(Locale.ROOT).equals("exit")) {
            isWorking = false;
            System.out.println("End of program");
        } else if (userInput.toLowerCase(Locale.ROOT).equals("get")) {
            if (stringList != null && stringList.isEmpty() == false) {
                System.out.println("First element in list was - " + stringList.get(0));
                stringList.remove(0);
            } else {
                throw new UserMemoryIsEmptyCheckException("Memory doesn't initialize");
            }
        } else if (stringList.size() == maxAmountOfElements) {
            throw new UserMemoryIsFullException("Memory is full!");
        }
        return isWorking;
    }


}
