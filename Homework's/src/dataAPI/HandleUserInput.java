package dataAPI;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class HandleUserInput {
    public void handleUserStringInput(String userInput, Predicate<String> valid, Consumer<String> process) {
        if (valid.test(userInput) == true) {
           process.accept(userInput);
        } else {
            System.out.println("User input isn't valid");
        }
    }

    public void handleUserIntInput(int userInput,Predicate<Integer> valid, Consumer<Integer> process)
    {
        if(valid.test(userInput) == true)
        {
            process.accept(userInput);
        }else
        {
            System.out.println("User input isn't valid");
        }
    }
}
