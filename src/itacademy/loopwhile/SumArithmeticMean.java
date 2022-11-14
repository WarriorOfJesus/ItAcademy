package itacademy.loopwhile;

import java.util.Scanner;

public class SumArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double arithmeticMean = 0.0;
        int number1;
        do {
            System.out.println("Enter number: ");
            number1 = scanner.nextInt();
            sum += number1; // sum = sum + number;
            if (number1 != 0) {
                count++;
            }
        } while (number1 != 0);
        arithmeticMean = (double) sum / count;
        System.out.println("number of numbers entered: " + count);
        System.out.println("Sum: " + sum);
        System.out.printf("Arithmetic Mean: %.2f", arithmeticMean);

    }


}
