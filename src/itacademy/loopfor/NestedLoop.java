package itacademy.loopfor;

import java.util.Arrays;
import java.util.Scanner;


public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size for array:");
        int numberForArray = scanner.nextInt();
        int[] array = new int[numberForArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter index for array: ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int count = 0;
        for (int k = 1; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
                count = 1;

            } else if (array[k] == max) {
                count++;
            }
        }
            System.out.println(max + " have bigger number");
        System.out.println("quality bigger number:" + count);
        System.out.println(Arrays.toString(array));

/*
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        for (int i = numberA; i < numberB; i++) {
            boolean isSimple = true;
            for (int k = 2; k <= i / 2; k++) {
                if (i % k == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(i);
            }

        }
*/

/*        for (int number = 2; number <= 1000; number++) {
            int count = 0;
            for (int k = 2; k < number; k++) {
                if (number % k  == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(number);
            }
        }*/
    }
}
