package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceDB {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String login = "postgres";
    private final String password = "DimafromBelarus1";
    private Connection connection;

    public void openConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException exception) {
            System.out.println("Postgres SQL JDBC Driver is not found. Include it in your library path ");
            exception.getException();
            return;
        }

        System.out.println("Postgres SQL JDBC Driver successfully connected");
        connection = null;

        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException exception) {
            System.out.println("There is problem with connection to local database");
            exception.getNextException();
        }

        if (connection != null) {
            System.out.println("Connection to database successful");
           /* createTable();
            insertValuesIntoTable();*/
        } else {
            System.out.println("Failed to make connection to database");
        }
    }

    public void createTable() {
        try {
            Statement createTableStatement = connection.createStatement();
            createTableStatement.execute("create table if not exists users (userID serial primary key," +
                    "userName character  varying (30)," +
                    "userAge int)");
            System.out.println("Table users was created!");
        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }
    }

    public void displayUsers() {
        try {
            Statement getStatement = connection.createStatement();
            ResultSet users = getStatement.executeQuery("select *from users");
            System.out.println("\tUsers from database: ");
            while (users.next()) {
                System.out.println(users.getString(2) + " " + users.getInt(3));
            }

        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }
    }

    public List<User> getUsers() {
        String userName;
        Integer userAge;
        Integer userID;

        List<User> userList = new ArrayList<>();

        try {
            Statement getStatement = connection.createStatement();
            ResultSet users = getStatement.executeQuery("select * from users");
            while (users.next()) {
                userID = users.getInt(1);
                userName = users.getString(2);
                userAge = users.getInt(3);

                userList.add(new User(userID,userName,userAge));
            }
        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }
        return userList;
    }

    public void selectByName(String name){
        try{
            PreparedStatement selectStatement = connection.prepareStatement("select * from users where userName = ?");
            selectStatement.setString(1,name);
            ResultSet resultSet = selectStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2)+
                        " " + resultSet.getInt(3));
            }

        }catch (SQLException exception){
            System.out.println(exception.getCause());
        }
    }

    public void selectByAge(int age){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select *from users where userAge = ?");
            preparedStatement.setInt(1,age);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Users with age = "+ age);
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2)+" "
                + resultSet.getInt(3));
            }

        }catch (SQLException exception){
            System.out.println(exception.getCause());
        }
    }

    public void deleteWholeInfoFromDB() {
        try {
            Statement deleteStatement = connection.createStatement();
            deleteStatement.execute("delete from users");
            System.out.println("Whole users were deleted");
        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }
    }

    public void insertValuesIntoTable() {
        try {
            Statement insertValues = connection.createStatement();
            insertValues.execute("insert into users(userName,userAge)\n" +
                    "VALUES ('Dima Prudnik',20),\n" +
                    "       ('Ivan Petrov',18),\n" +
                    "       ('Egor Davidov',19),\n" +
                    "       ('Aleksandr Koshuba',29)");
            System.out.println("Values were insert into table users");
        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }

    }

    public void dropTable() {
        try {
            Statement dropTableStatement = connection.createStatement();
            dropTableStatement.execute("drop table if exists users");
            System.out.println("Table users was deleted");
        } catch (SQLException exception) {
            System.out.println(exception.getCause());
        }
    }


    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection close");
        } catch (SQLException exception) {
            System.out.println("There is a problem with the end of connection");
        }

    }
}
