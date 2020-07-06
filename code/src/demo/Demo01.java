package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * map中key存储nums[i]，value存储i
 * 遍历数组，查看map中key是否存有target-nums[i]
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 13;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
