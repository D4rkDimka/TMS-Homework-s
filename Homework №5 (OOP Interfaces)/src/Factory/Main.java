package Factory;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Director",1000);
        Accountant accountant = new Accountant("Accountant",500);

        director.displayPersonInformation();
        accountant.displayPersonInformation();
    }
}
