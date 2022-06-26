package jdbc;

public class Main {
    public static void main(String[] args) {
        ServiceDB connection = new ServiceDB();
        connection.openConnection();
        connection.selectByAge(20);
        connection.closeConnection();
    }
}
