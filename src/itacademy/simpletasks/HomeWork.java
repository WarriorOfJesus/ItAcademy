package itacademy.simpletasks;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("enter second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum );
        System.out.printf("%d %s %d %s %d", firstNumber, "+", secondNumber, "=", sum);




    }
}
