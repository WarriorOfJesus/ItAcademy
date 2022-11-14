package itacademy.simpletasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int number2;
        int sum = 0;
            do {
                System.out.println("enter number: ");
                number = scanner.nextInt();
                number2 = scanner.nextInt();
                sum = number + number2;
                System.out.println(sum);
            } while (number != 0);


       /* while(number != 0 && number2 != 0){
            System.out.println("enter numbers: ");
            sum = number + number2;
            System.out.println(sum);
            if(sum == 0) break;
            sum--;
            System.out.println(sum);
            break;*/

    }
}
