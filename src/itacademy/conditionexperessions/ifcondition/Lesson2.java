package itacademy.conditionexperessions.ifcondition;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int first = scanner.nextInt();
        System.out.print("enter second number: ");
        int second = scanner.nextInt();
        System.out.print("enter third number: ");
        int third = scanner.nextInt();

        if (first > second && first > third) {
            System.out.println("this number bigger: " + first);
            //System.out.println(first + " is number bigger then: " + second);
        } else if (second > first && second > third){
            System.out.println("this number bigger: " + second);
            //System.out.println(second + " is number bigger then: " + first);
        }
        else {
            System.out.println("this number bigger" + third);
        }
    }
}
