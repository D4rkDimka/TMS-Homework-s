package Practice_NOT_FOR_CHECK;

public class Dog {
    private String dogName;
    private Integer dogAge;
    private String dogSex;

    public Dog(){}

    public Dog(String dogName, Integer dogAge, String dogSex) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogSex = dogSex;
    }

    public String getDogName() {
        return dogName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                ", dogSex='" + dogSex + '\'' +
                '}';
    }
}
