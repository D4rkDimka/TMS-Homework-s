package collections;

import java.util.*;

public class UserService {
    private List<User> userList;
    private Set<User> userSet;

    public UserService() {
        userList = new ArrayList<>();
        userSet = new HashSet<>();
    }

    public void createUserListAndSet() {
        userList.add(new User("Dmitriy", 20, "Male"));
        userList.add(new User("Alex", 18, "Male"));
        userList.add(new User("Svetlana", 15, "Female"));
        userList.add(new User("John", 62, "Male"));
        userList.add(new User("John", 62, "Male"));
        userList.add(new User("Natalia", 36, "Female"));

        userSet.add(new User("Julia", 20, "Female"));
        userSet.add(new User("Larisa", 21, "Female"));
        userSet.add(new User("Ted", 52, "Male"));
        userSet.add(new User("John", 33, "Male"));
        userSet.add(new User("Tatyana", 32, "Female"));
        userSet.add(new User("John", 72, "Male"));
    }

    public void displayUserList() {
        Iterator<User> listIterator = userList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }
    }

    public void displayUserSet() {
        for (User user : userSet) {
            System.out.println(user.toString());
        }
    }

    public boolean findUserByFullNameInList(String fullName) {
        Iterator<User> userIterator = userList.iterator();
        boolean isFound = false;
        int amountOfUsers = 0;

        while (userIterator.hasNext()) {
            if (userIterator.next().getFullName().equals(fullName)) {
                isFound = true;
                amountOfUsers++;
            }
        }
        if (amountOfUsers > 0)
            System.out.printf("\nAmount of users in list with such name(%s) - %d", fullName, amountOfUsers);
        return isFound;
    }

    public boolean findUserByFullNameInSet(String fullName) {
        Iterator<User> userIterator = userSet.iterator();
        boolean isFound = false;
        int amountOfUsers = 0;

        while (userIterator.hasNext()) {
            if (userIterator.next().getFullName().equals(fullName)) {
                isFound = true;
                amountOfUsers++;
            }
        }
        if (amountOfUsers > 0)
            System.out.printf("\nAmount of users in set with name(%s) - %d", fullName, amountOfUsers);
        return isFound;
    }

    public List<User> getListBySex(String sex) {
        List<User> tempList = new ArrayList<User>();

        if (sex.equals("Male")) {
            for (User user : userList) {
                if (user.getSex().equals("Male")) tempList.add(user);
            }
        } else if (sex.equals("Female")) {
            for (User user : userList) {
                if (user.getSex().equals("Female")) tempList.add(user);
            }
        } else System.out.printf("There are no elements with sex (%s)", sex);
        return tempList;
    }

    public Set<User> getSetBySex(String sex) {
        Set<User> tempSet = new HashSet<User>();

        if (sex.equals("Male")) {
            for (User user : userSet) {
                if (user.getSex().equals("Male")) tempSet.add(user);
            }
        } else if (sex.equals("Female")) {
            for (User user : userSet) {
                if (user.getSex().equals("Female")) tempSet.add(user);
            }

        } else System.out.printf("There is no elements with sex (%s)", sex);
        return tempSet;
    }

    public List<User> getSortedList() {
        List<User> sortedList = new ArrayList<>();
        sortedList = userList;
        Collections.sort(sortedList);

        return sortedList;
    }

    public List<User> getSortedSet() {
        List<User> sortedSet = new ArrayList<>(userSet);
        Collections.sort(sortedSet);
        Iterator<User> setIterator = sortedSet.iterator();

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next().toString());
        }

        return sortedSet;
    }

    public boolean isEmptyList() {
        if (userList.isEmpty()) return true;
        else return false;
    }

    public boolean isEmptySet() {
        if (userSet.isEmpty()) return true;
        else return false;
    }

    public void findNumberInMap() {
        int[] numbers = {1, 1, 2, 1, 5, 6, 6, 6, 8, 5, 9, 7, 1};

        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int maxElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            int arrayElement = numbers[i];
            map.put(arrayElement, map.getOrDefault(arrayElement, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxElement = entry.getKey();
            }

        }
        System.out.println("max element => " + maxElement);
        System.out.println("frequency => " + maxFrequency);
    }
}

