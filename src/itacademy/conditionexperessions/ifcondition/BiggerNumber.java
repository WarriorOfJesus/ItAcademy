package itacademy.conditionexperessions.ifcondition;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter five numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        int fifth = scanner.nextInt();

        if (first > second && first > third && first > fourth && first > fifth) {
            System.out.println("this number bigger: " + first);
            //System.out.println(first + " is number bigger then: " + second);
        } else if (second > first && second > third && second > fourth && second > fifth) {
            System.out.println("this number bigger: " + second);
            //System.out.println(second + " is number bigger then: " + first);
        } else if (third > first && third > second && third > fourth && third > fifth) {
            System.out.println("this number bigger: " + third);
        } else if (fourth > first && fourth > second && fourth > third && fourth > fifth) {
            System.out.println("this number bigger: " + fourth);
        } else {
            System.out.println("this number bigger: " + fifth);
        }
    }
}
