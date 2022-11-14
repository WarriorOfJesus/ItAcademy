package itacademy.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FoundNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter number for array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length - 1; i++){
            array[i] = random.nextInt(10);// это не без формулы рандом до 5 числа включсительно,
            // но лучше использовать формулу для использования диапозона;
            for(int k = 0; k<array.length;k++ )
            if(array[k] == array[i+1]){
                System.out.println("array[ " + array[i] + " ]");
            }else
                System.out.println("this number don't have in array...");
        }
        System.out.println(Arrays.toString(array));
    }
}
