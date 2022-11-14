package itacademy.simpletasks;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("your name: " + name);
//        System.out.println("hello!!! " + name);
//        System.out.println("How are you? ");
//        String yourMood = scanner.nextLine();
//        System.out.println("Your mood:) " + yourMood);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate x of point A: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter coordinate y of point A: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinate x of point B: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter coordinate y of point B: ");
        double y2 = scanner.nextDouble();

        //double result = Math.sqrt((Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)));
        double result1 = Math.pow(x2 - x1, 2);
        double result2 = Math.pow(y2 - y1, 2);
        double result3 = Math.sqrt(result1 + result2);
        //System.out.printf("Segment's length: %.3f", result3);
        System.out.printf("Segment's length: " + result3);



    }
}
