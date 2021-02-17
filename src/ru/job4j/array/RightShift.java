package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int temp;
        for (int index = 0; index < count; index++) {
            temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        }
    }
}
