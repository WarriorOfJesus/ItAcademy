package itacademy.loopwhile;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, checkFirstNum, checkSecondNum = 0;
        int count = 0;
        num = scanner.nextInt();
        while (num > 0) {
            checkFirstNum = num % 10;
            if(checkFirstNum == checkSecondNum) {
                count++;
                boolean b = count > 0;
                System.out.println("yes");
            }else System.out.println("no");
        }
    }
}
