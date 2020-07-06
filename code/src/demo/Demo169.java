package demo;

import java.util.Arrays;

public class Demo169 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];

        int result = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                count++;
            } else if (--count == 0) {
                result = nums[i];
                count = 1;
            }
        }
        return result;
    }
}
