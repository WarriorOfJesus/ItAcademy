package itacademy.loopwhile;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter natural number: ");
        int number = scanner.nextInt();
        int lastDigit = 0;
        int penultimateDigit = 0;
        boolean isEquals = false;
        while (number > 0 && !isEquals) {
            lastDigit = number % 10;
            number = number / 10;
            penultimateDigit = number % 10;
            isEquals = lastDigit == penultimateDigit;
        }
        if (isEquals) System.out.println(" Yes");
        else System.out.println("No");
    }
}
