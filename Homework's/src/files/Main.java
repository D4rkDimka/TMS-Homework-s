package files;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dima Prudnik",20,"Male");
        FileOperations fileOperations = new FileOperations();
        fileOperations.writeAndReadUserInFile(user);
        fileOperations.divideTextIntoTwoFiles();
    }
}
