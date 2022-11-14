package itacademy.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter number for finding in array: ");
        int number = scanner.nextInt();
        System.out.println("enter number for size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 - 50) + 1;
            if (number == array[i]) {
                System.out.println("array[" + array[i] + "]");
            } else
                System.out.println(number + " Didn't find");
            System.out.println(Arrays.toString(array));
        }
    }
}
