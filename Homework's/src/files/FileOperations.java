package files;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public void writeAndReadUserInFile(User user) {
        Scanner in = new Scanner(System.in);
        System.out.println("1) - Write in file object\n2) - Read object from file\nYour choice>> ");
        int userChoice = in.nextInt();

        switch (userChoice) {
            case 1:
                try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Users.txt", false))) {
                    objectOutputStream.writeObject(user);
                    objectOutputStream.flush();
                    System.out.println("Object was written successful");
                } catch (IOException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case 2:
                try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Users.txt"))) {
                    Object fileUser = objectInputStream.readObject();
                    System.out.println((User) fileUser);

                } catch (IOException | ClassNotFoundException exception) {
                    System.out.println(exception.getMessage());
                }
        }

    }

    public void divideTextIntoTwoFiles() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
             BufferedWriter bufferedWriterRomeo = new BufferedWriter(new FileWriter("Romeo.txt", false));
             BufferedWriter bufferedWriterJuliet = new BufferedWriter(new FileWriter("Juliet.txt", false))) {
            String lineFromFile;
            BufferedWriter tempFileWriter = null;
            boolean wasWrittenRomeo = false;
            boolean wasWrittenJuliet = false;

            while ((lineFromFile = bufferedReader.readLine()) != null) {
                if (lineFromFile.equals("Romeo:")) {
                    if (wasWrittenRomeo == false) bufferedWriterRomeo.write("Romeo part\n\n");
                    tempFileWriter = bufferedWriterRomeo;
                    wasWrittenRomeo = true;
                } else if (lineFromFile.equals("Juliet:")) {
                    if (wasWrittenJuliet == false) bufferedWriterJuliet.write("Juliet part\n\n");
                    tempFileWriter = bufferedWriterJuliet;
                    wasWrittenJuliet = true;
                }
                tempFileWriter.write(lineFromFile + '\n');
            }

            bufferedWriterRomeo.flush();
            bufferedWriterJuliet.flush();
            tempFileWriter.flush();

            System.out.println("Text is divided into 2 files");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
