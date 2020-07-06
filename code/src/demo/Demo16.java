package demo;

import java.util.Arrays;

public class Demo16 {

    public static void main(String[] args) {
        int[] nums = {1,1,-1,-1,3};
        int target = -1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int targetLen = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < target) {
                    if (Math.abs(sum - target) < targetLen) {
                        targetLen = Math.abs(sum - target);
                        result = sum;
                    }
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (sum > target) {
                    if (Math.abs(sum - target) < targetLen) {
                        targetLen = Math.abs(sum - target);
                        result = sum;
                    }
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    return sum;
                }
            }
        }
        return result;
    }
}
