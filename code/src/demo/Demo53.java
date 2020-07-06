package demo;

public class Demo53 {

    public static void main(String[] args) {
        int[] nums = {5, 1, -3};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int result = nums[0];
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

}
