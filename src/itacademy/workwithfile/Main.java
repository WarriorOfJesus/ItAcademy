package itacademy.workwithfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("Main.txt");
        FileReader fileReader1 = new FileReader("ItAcademy/src/itacademy/workwithfile/Main.java");
        FileWriter fileWriter = new FileWriter("file1.txt");
        FileReader fileReader = new FileReader("file1.txt");
        FileWriter fileWriter2 = new FileWriter("file2.txt");
        FileReader fileReader2 = new FileReader("file2.txt");
        Scanner sc = new Scanner(fileReader);
        Scanner scanner = new Scanner(fileReader1);
        while (scanner.hasNextLine()) {
            fileWriter1.write(scanner.nextLine() + "\n");
        }

//        fileWriter.write("hello from the other side");
//        fileWriter.close();
//        char var = (char) 65;
        int firstChar = (int) 'A';
        int lastChar = (int) 'Z';
        int num = 0;
        for (; firstChar <= lastChar; firstChar++) {
            char firstLetter = (char) firstChar;
            fileWriter.write(firstLetter + "\n");
        }
        for (; num < 10; num++) {
            fileWriter.write(num + "\n");
        }
        fileWriter.close();
        int number = 1;
        while (sc.hasNextLine()) {
//            System.out.println(number + ":" + sc.nextLine());
            String line = sc.nextLine();
            if (number % 3 == 0) {
                fileWriter2.write(line);
                System.out.println(line);
            }
            number++;

        }
        fileReader.close();
        fileWriter2.close();
        fileWriter1.close();
        fileReader1.close();
    }
}
