package itacademy.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter number for array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
//        System.out.println("array size " + array.length);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((190 - 160) + 1) + 160;
            if (array[i] > 180 && array[i] < 190){
                System.out.println("height [" + i + "]" + " = " + array[i]);
                count++;

            }
        }
       // System.out.println(Arrays.toString(array));
        System.out.println("count = " + count);
        //System.out.println(Arrays.toString(array));
    }
}
