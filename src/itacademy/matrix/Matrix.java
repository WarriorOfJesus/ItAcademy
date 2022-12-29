package itacademy.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();
/*
        int[][] array = new int[3][3];
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt((9 - 1) + 1)+1;
                System.out.print(array[i][j] + " ");
                count++;
                sum = sum + array[i][j];

            }
            System.out.println();
        }

        System.out.println("arithmetic mean:"+ (sum/count));

    //}
*/
/*
    Random random = new Random();
    int[][] array = new int[4][4];
    double sum = 0;
    int count = 0;
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = random.nextInt(255);
            System.out.print(array[i][j] + " ");
            count++;
            sum = sum + array[i][j];

        }
        System.out.println();
    }
        double arithmeticMean = sum/count;

        System.out.println("arithmetic mean:"+ arithmeticMean );
        int[][] array2 = new int[4][4];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(array[i][j] < arithmeticMean){
                    array[i][j] = 0;
                }else if(array[i][j] > arithmeticMean){
                    array[i][j]= 255;
                }
                System.out.print(array[i][j] + " ");


            }
            System.out.println();
        }*/
        int[][] matrix = new int[4][4];
        System.out.println("Matrix A:");
        int max = matrix[0][0];
        int minimum = Integer.MAX_VALUE;//int minimum = matrix[0][0];
        int number1Index1 = 0;
        int number1Index2 = 0;
        int number2Index1 = 0;
        int number2Index2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt((99 - 10) + 1) + 10;
                System.out.print(matrix[i][j] + " ");
                if (i == 0 && j == 0) {
                    minimum =matrix[i][j];
                }
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
                if (minimum > matrix[i][j]) {
                    //number1Index1 = Arrays1.binarySearch(matrix[][]);
                    minimum = matrix[i][j];
                }
            }
            System.out.println();
        }
        //number1Index2 = ;
        System.out.println("the biggest elements["+ number1Index1+"]["+ number1Index2 + "]" +max);
        System.out.println(minimum);
    }
}
