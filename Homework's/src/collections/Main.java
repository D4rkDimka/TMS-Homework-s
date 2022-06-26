package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        if (userService.isEmptyList() == true && userService.isEmptySet() == true) {
            userService.createUserListAndSet();
        }

        System.out.println("List before sort");
        userService.displayUserList();

        List<User> sortedList = userService.getSortedList();
        Iterator<User> sortedListIterator = sortedList.iterator();

        System.out.println("List after sort");

        displayList(sortedList);

        System.out.println("Set before sort");
        userService.displayUserSet();
        System.out.println("Set after sort");
        userService.getSortedSet();

        userService.findUserByFullNameInList("John");
        userService.findUserByFullNameInSet("John");

        System.out.println("\nMale");
        List<User> maleList = userService.getListBySex("Male");
        displayList(maleList);
        System.out.println("\nFemale");
        List<User> femaleList = userService.getListBySex("Female");
        displayList(femaleList);

        System.out.println("\nMale");
        Set <User> maleSet = userService.getSetBySex("Male");
        displaySet(maleSet);
        System.out.println("\nFemale");
        Set <User> femaleSet = userService.getSetBySex("Female");
        displaySet(femaleSet);
        userService.findNumberInMap();
    }

    static void displayList(List<User> list) {
        Iterator<User> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }
    }

    static void displaySet(Set<User> set) {
        Iterator<User> setIterator = set.iterator();

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next().toString());
        }
    }

}
