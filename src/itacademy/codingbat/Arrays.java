package itacademy.codingbat;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        unlucky1(new int[]{2, 1, 3, 4, 5});
    }

    static public int[] makeMiddle(int[] nums) {

        int[] array = new int[2];
        //int length = (nums.length -1 ) / 2;
        int length = nums.length / 2;
        array[0] = nums[length - 1];
        array[1] = nums[length];
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }
    static public int[] midThree(int[] nums) {

        int[] array = new int[3];
        //int length = (nums.length -1 ) / 2;
        int length = nums.length / 2;
        array[0] = nums[length - 1];
        array[1] = nums[length];
        array[2] = nums[length + 1];
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }
    static public boolean unlucky1(int[] nums) {
        if(nums.length < 2){
            return false;
        }else if(nums[0] == 1 && nums[1] == 3 ||
                nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3){
            return true;
        } else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }else return false;
    }
    public boolean sameFirstLast(int[] nums) {
        if(nums.length > 0 && nums[0] == nums[nums.length -1]){
            return true;
        }else return false;
    }
    static public int[] make2(int[] a, int[] b){
        int[] array = new int[2];
        int lengthA = a.length;
        int lengthB = b.length;
        if(lengthA == 0){
            array[0] = b[0];
            array[1] = b[1];
            System.out.println(java.util.Arrays.toString(array));
        }else if(lengthB == 0){
            array[0] = a[0];
            array[1] = a[1];
            System.out.println(java.util.Arrays.toString(array));
            return array;
        }else if(lengthA == 1 && lengthB == 1){
            array[0] = a[0];
            array[1] = b[0];
            System.out.println(java.util.Arrays.toString(array));
            return array;
        }
        return array;
    }
}
