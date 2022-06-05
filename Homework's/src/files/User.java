package files;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private String sex;

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name: "+ this.name+
                "\nAge: "+ this.age+
                "\nSex: "+this.sex;
    }
}
