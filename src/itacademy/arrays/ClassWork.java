package itacademy.arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class ClassWork {
    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 10;
        ints[1] = 10;
        ints[2] = 10;
        Arrays.asList(ints);

        int oddCount = 0;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                arrayList.add(oddCount++, i);
            }
            if (i % 2 == 0) {
                arrayList.add(arrayList.size(), i);
//                arrayList.remove(oddCount);
            }
        }
       /* for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0 || arrayList.get(i) % 3 == 0) {
                arrayList2.add(arrayList.get(i));
            }
        }*/
        System.out.println(arrayList.get(10));
        System.out.println(arrayList);
        System.out.println(arrayList2);
    }
}
