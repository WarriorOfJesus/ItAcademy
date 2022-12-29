package itacademy.workwithexceptions;

import itacademy.codingbat.Arrays1;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        if(number != sqrt(5)){
            System.out.println("Error");
        }
        System.out.println(sqrt(number));
        Cat[] cats = {new Cat("Masha"), new Cat("Sasha"), null};
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(cats[i]);
            } catch (NullPointerException e) {
                System.out.println(e);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e);
            }
            finally {
                System.out.println("i will work in any situation ");
            }
            System.out.println(Arrays.toString(cats));
        }
    }
}
