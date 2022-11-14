package itacademy.loopwhile;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sumOdd = 0;
        for (; number1 <= number2; number1++) {
            if (number1 % 2 != 0) {
                sumOdd = sumOdd + number1;
            }
        }
        System.out.println(sumOdd);
    }
}
