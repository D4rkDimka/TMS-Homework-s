package jdbc;

public class User {
    private Integer ID;
    private String userName;
    private Integer userAge;

    public User(Integer ID, String userName, Integer userAge) {
        this.ID = ID;
        this.userName = userName;
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
