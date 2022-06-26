package Practice_NOT_FOR_CHECK;

import java.util.*;

public class User {
    private String userName;
    private Integer userAge;
    private String userSex;

    public User(){}

    public User(String userName, Integer userAge, String userSex) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userAge, user.userAge) && Objects.equals(userSex, user.userSex);
    }

    Comparator<User> comparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            if(o1.getUserAge() == o2.getUserAge()){
                return o1.getUserName().compareTo(o2.getUserName());
            }else return o1.userAge.compareTo(o2.getUserAge());
        }
    };

    void sortUsers()
    {
        List<User> users = new ArrayList<>();
        users.add(new User("2",2,"2"));
        users.add(new User("1",1,"1"));
        users.add(new User("3",3,"3"));
        displayCollections(users);
        Collections.sort(users,comparator);
        displayCollections(users);

    }

    void displayCollections(List<User> list){
        for(User user: list){
            System.out.println(user.toString());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userAge, userSex);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", comparator=" + comparator +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getUserSex() {
        return userSex;
    }
}
