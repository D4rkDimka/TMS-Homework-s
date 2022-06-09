package collections;

import java.util.Objects;

public class User implements Comparable<User> {
    private String fullName;
    private int age;
    private String sex;

    public User(String fullName, int age, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(fullName, user.fullName) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        else if (this.age == o.age) {
            int result = this.fullName.compareTo(o.fullName);
            return result;
        } else return 0;
    }

    @Override
    public String toString() {
        return "User name - " + fullName
                + "/Age - " + age
                + "/Sex - " + sex + '\n';
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
