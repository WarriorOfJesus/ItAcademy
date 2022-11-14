package itacademy.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter number for array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        double arithmeticMean = 0;
        int sum = 0;
        int count = 0;

        double arithmeticMean2 = 0;
        int sum2 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((50 - 1) + 1) + 1;
            if (array[i] < 50) {
                sum += array[i];
                count++;
                arithmeticMean = (double) sum / count;
                System.out.println(array[i]);
            }
            array[i] = random.nextInt((100 - 50) + 1) + 50;
            if (50 < array[i] && array[i] < 100) {
                sum2 += array[i];
                arithmeticMean2 = (double) sum2 / count2;
                System.out.println(array[i]);
            }
            //System.out.println(arithmeticMean);
        }
        System.out.println(sum);
        System.out.println("arithmetic mean the elements[0, 49] " + arithmeticMean);
        System.out.println(sum2);
        System.out.println("arithmetic mean the elements[50, 100] " + arithmeticMean2);
        //System.out.println("sum every numbers: " + sum);
        //System.out.println("arithmetic mean: " + arithmeticMean);

    }
}
