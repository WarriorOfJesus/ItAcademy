package itacademy.loopwhile;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers:");
       /* int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);*/
        /*int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        while (number1 <= number2) {
            System.out.println(number1 + " * " +  number1 + " = " + (number1 * number1));
            number1++;
        }*/
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        int count = 0;
        boolean isMinus = (number1 < 0 && number2 > 0) || (number1 > 0 && number2 < 0);
        System.out.print(number1 + " * " + number2 + " = ");
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        while (count < number1) {
            sum = sum + number2;

            count++;
        }
        if(isMinus) System.out.println(-sum);
        else System.out.println(sum);
    }
}

