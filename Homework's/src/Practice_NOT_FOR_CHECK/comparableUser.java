package Practice_NOT_FOR_CHECK;

public class comparableUser implements Comparable<comparableUser >{
    private String userName;
    private Integer userAge;
    private String userSex;

    public comparableUser (){}

    public comparableUser (String userName, Integer userAge, String userSex) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    @Override
    public int compareTo(comparableUser o) {
        return this.userAge.compareTo(o.userAge);
    }
}
