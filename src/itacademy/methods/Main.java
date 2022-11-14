package itacademy.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the price:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        sumBigger1000(num1, num2, num3);*/
        getMultiplicationTable();
        //int[] array2 = new int[]{1, 2, 3, 4};
        //getArrayIncreasedByOne(array2);
        //writeArray(array2);
        //writeDashes(7);
        /*int a = 2;
        int b = 7;
        arithmeticMean(a, b);*/
    }

    static void getMultiplicationTable() {
        for (int i1 = 1; i1 <= 10; i1++) {
            for (int i2 = 0; i2 <= 10; i2++) {
                int sum = i2 * i1;
                System.out.println(i2 + " * " + i1 + " = " + sum);
            }
        }
    }

    static void writeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    static void writeDashes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
    }

    static void getArrayIncreasedByOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
        System.out.println(Arrays.toString(array));
    }

    static void arithmeticMean(int number1, int number2) {
        double sum = (double) (number1 + number2) / 2;
        System.out.println("arithmetic mean: " + sum);
    }

    static int sumBigger1000(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
        if (sum > 1000) {
            System.out.println("Sum is bigger than 1000");
        } else System.out.println("sum is less than 1000");

        return sum;
    }

    static int returnArray(int[] array) {
        if(array.length == 0 || array.length == 1);
        //double sum = 0;
        //double arithMean = 0;
        int count = 0;
        int size = 0;
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] % 2 == 0){

            }
        }
        return size;
    }
}

