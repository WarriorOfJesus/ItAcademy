package itacademy.conditionexperessions.ifcondition;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        if (age > 1 && age < 5 || (age % 10) > 1 && (age % 10) < 5) {
            System.out.println("Tebe " + age + " goda");
        } else if ((age % 10) == 1) {
            System.out.println("Tebe " + age + " god");
        } else {
            System.out.println("tebe " + age + " let");
        }
    }
}
