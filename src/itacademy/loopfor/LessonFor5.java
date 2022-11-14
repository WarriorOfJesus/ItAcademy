package itacademy.loopfor;

import java.util.Scanner;

public class LessonFor5 {
    public static void main(String[] args) {
 /*       int i;
        int number = 1;
        for (i = 5; i <= 50; i += 5) {
            System.out.println("5" + " * " + number++ + " = " + i);
        }*/
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        for(int i1 = 1; i1 <=10; i1++){
            int sum = number1 * i1;
            System.out.println(number1 + " * " + i1 + " = " + sum);
        }
    }
}
