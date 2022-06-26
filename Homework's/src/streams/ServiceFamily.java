package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ServiceFamily {
    private List<Family> families;

    ServiceFamily(){
        Random random = new Random();
        families = Arrays.asList(new Family("firstFamily","address1",random.nextInt(0,1000),
                Arrays.asList(      new Child("firstChild1",random.nextInt(0,15),Sex.MAN),
                                    new Child("firstChild2",random.nextInt(0,15),Sex.MAN),
                                    new Child("firstChild3",random.nextInt(0,15),Sex.WOMAN))),

                new Family("secondFamily","address2",random.nextInt(0,1000),
                Arrays.asList(      new Child("secondChild1",random.nextInt(0,15),Sex.MAN),
                                    new Child("secondChild2",random.nextInt(0,15),Sex.MAN),
                                    new Child("secondChild3",random.nextInt(0,15),Sex.WOMAN))),

                new Family("thirdFamily","address3",random.nextInt(0,1000),
                Arrays.asList(      new Child("thirdChild1",random.nextInt(0,15),Sex.MAN),
                                    new Child("thirdChild2",random.nextInt(0,15),Sex.MAN),
                                    new Child("thirdChild3",random.nextInt(0,15),Sex.WOMAN))));

    }

    public void getMap(){
        Map <String,Integer> map = families.stream().
                collect(Collectors.toMap(Family::getFamilySurname, Family::getAvgSalary));
        System.out.println(map);

    }

    public void getMen(){
        long amount = families.stream()
                .flatMap(member->member.getChildren().stream())
                .filter(member-> member.getSex() == Sex.MAN)
                .count();

        System.out.println("Amount of boys - " + amount);
    }

    public void getWoman(){
        List<Child> stream = families.stream()
                .flatMap(member->member.getChildren().stream())
                .filter(member->member.getSex() == Sex.WOMAN)
                .collect(Collectors.toList());

        System.out.println(stream);
    }

    public void hasChild(String name){
        boolean hasChild =  families.stream()
                .flatMap(member -> member.getChildren().stream())
                .anyMatch(member -> member.getName() == name);
        if(hasChild == true) System.out.println("There is baby with name - "+ name);
        else System.out.println("There are no children with name - "+ name);
    }

    public void getAmountOfChildren(){
        long firstCount = families.stream()
                .filter(family -> family.getFamilySurname() == "firstFamily")
                .flatMap(member -> member.getChildren().stream())
                .count();

        long secondCount = families.stream()
                .filter(family -> family.getFamilySurname() == "secondFamily")
                .flatMap(member -> member.getChildren().stream())
                .count();

        long thirdCount = families.stream()
                .filter(family -> family.getFamilySurname() == "thirdFamily")
                .flatMap(member -> member.getChildren().stream())
                .count();

        System.out.println("First family - "+ firstCount+"\nSecond family - "+ secondCount+"\nThird family - " +thirdCount);
    }
}
