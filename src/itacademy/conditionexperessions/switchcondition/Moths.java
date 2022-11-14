package itacademy.conditionexperessions.switchcondition;

import java.util.Scanner;

public class Moths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of months: ");
        int numberOfMonth = scanner.nextInt();
        switch (numberOfMonth){
            case 1:
                System.out.println("You chosed January ");
                break;
            case 2:
                System.out.println("You chosed February ");
                break;
            case 3:
                System.out.println("You chosed March");
                break;
            case 4:
                System.out.println("You chosed April ");
                break;
            case 5:
                System.out.println("You chosed May ");
                break;
            case 6:
                System.out.println("You chosed June ");
                break;
            case 7:
                System.out.println("You chosed July ");
                break;
            case 8:
                System.out.println("You chosed August ");
                break;
            case 9:
                System.out.println("You chosed September");
                break;
            case 10:
                System.out.println("You chosed October ");
                break;
            case 11:
                System.out.println("You chosed November ");
                break;
            case 12:
                System.out.println("You chosed December ");
                break;
            default:
                System.out.println("only 12 months =), please, enter normal number," +
                        "i know, you can do it!!! ");
        }
    }
}
