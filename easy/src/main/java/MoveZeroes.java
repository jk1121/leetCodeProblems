package main.java;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        printArr(nums);
    }

    private static void printArr(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index] + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

}
