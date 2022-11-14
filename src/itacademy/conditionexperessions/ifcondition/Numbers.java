package itacademy.conditionexperessions.ifcondition;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 3 numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if (one == two && one == three){
            System.out.println("every numbers are equals");
        } else if (one == two || one == three || two == three) {
            System.out.println("two number are equals");
        }else{
            System.out.println("don't have equals numbers");
        }
    }
}
