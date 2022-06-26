package Practice_NOT_FOR_CHECK;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("BOBBY",1,"male");
        Predicate<String> isBobby = dogggy -> dogggy.equals("BOBBY");
        System.out.println(isBobby.test("BOBBY"));

        Consumer<Dog> getDogName = dogg-> System.out.println("Hello "+ dogg.getDogName()+" !");
        getDogName.accept(dog);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("BOBBY",1,"male"));
        dogs.add(new Dog("OB",2,"female"));
        dogs.add(new Dog("BBY",3,"male"));
        dogs.add(new Dog("BO",4,"female"));
        Supplier<Dog> getRandomName = ()->{
            Random random = new Random();
            int number = random.nextInt(0, dogs.size());

            return dogs.get(number);
        };

        Function<String,Integer> function = x-> Integer.valueOf(x);

        Dog newDog = getRandomName.get();
        System.out.println(newDog.toString());
    }
}
