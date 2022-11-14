package itacademy.loopwhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter number: ");
            number = scanner.nextInt();
        } while (number > 0);
        System.out.println("bye bye");

    }
}
