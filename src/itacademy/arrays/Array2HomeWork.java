package itacademy.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array2HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter number for array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        double arithmeticMean = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((101 - 1) + 1) + 1;
            sum += array[i];
            count++;
            arithmeticMean = (double) sum / count;
            //System.out.println(arithmeticMean);
            System.out.println(array[i]);
        }
        System.out.println("sum every numbers: " + sum);
        System.out.println("arithmetic mean: " + arithmeticMean);

    }
}
