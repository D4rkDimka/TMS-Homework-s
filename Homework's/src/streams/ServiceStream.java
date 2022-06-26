package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ServiceStream {
    private List<Integer> list;

    public void createListOfNumbers(){
        list = new ArrayList<>();
        Random random = new Random();
        Collections.addAll(list,random.nextInt(0,15),random.nextInt(0,15),random.nextInt(0,15),
                random.nextInt(0,15),random.nextInt(0,15),random.nextInt(0,15),random.nextInt(0,15),random.nextInt(0,15));
    }

    public void displayStream(){
        System.out.println("\nMethod foreach to display all elements from list");
        Stream stream = list.stream();
        stream.forEach(x->System.out.print(x + " "));
    }

    public void deleteSame(){
        System.out.println("\nMethod distinct to delete the same elements");
        Stream stream = list.stream();
        List<Integer> distinctList = stream.distinct().toList();
        distinctList.forEach(x->System.out.print(x+ " "));
    }

    public void displayEvenElements(){
        System.out.println("\nMethod that display only even elements in range( 7 <= x <=17)");
        List<Integer> stream = list.stream()
                .filter(el->el %2 == 0)
                .filter(el->el >= 7 && el <=17)
                .collect(Collectors.toList());
        stream.forEach(el->System.out.print(el+" "));
    }

    public void multiplyElements(){
        System.out.println("\nMethod that multiply each element to 2");
        List<Integer> stream = list.stream()
                .map(el->el*2)
                .peek(el->System.out.print(el+" "))
                .collect(Collectors.toList());

    }

    public void sort(){
        System.out.println("\nMethod that takes first 4 elements and sort them");
        List<Integer> stream = list.stream()
                .limit(4)
                .sorted()
                .peek(el->System.out.print(el+" "))
                .collect(Collectors.toList());
    }

    public void avgElements(){
        System.out.println("\nMethod that finds avg of elements");

        OptionalDouble stream = list.stream()
                .mapToInt(el->el)
                .average();
            System.out.println(stream.getAsDouble());
    }

    public void countElements(){
        System.out.println("\nMethod that shows amount of elements in stream");
        long count = list.stream().count();
        System.out.print("Amount - "+count);

    }
}
