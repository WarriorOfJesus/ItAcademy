package itacademy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class File3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter th login: ");
        String login = scanner.nextLine();
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("file3.txt");
        fileWriter.write("Login: " + login);
        fileWriter.write("\nPassword: " + password);
        fileWriter.close();
        FileReader fileReader = new FileReader("file3.txt");
        Scanner readScanner = new Scanner(fileReader);
        while (readScanner.hasNextLine()) {
            System.out.println(readScanner.nextLine());
        }
        String name;
        String password2;
        String ok = null;
        do {
            System.out.println("Enter the login: ");
            name = scanner.nextLine();
            System.out.println("Enter the password: ");
            password2 = scanner.nextLine();
            if (Objects.equals(name, login) && Objects.equals(password2, password)) {
                System.out.println("You come in System!");
                System.out.println("if you want to go out, please write 'ok' ");
                ok = scanner.nextLine();
            } else {
                System.out.println("these login and password don't right ");
                System.out.println("Try again");
            }
//            scanner.nextLine();
        } while (!Objects.equals(ok, "ok"));
    }

}
