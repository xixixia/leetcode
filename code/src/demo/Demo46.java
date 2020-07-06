package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo46 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        return dfs(nums, new ArrayList<Integer>(), flag, result);
    }

    private static List<List<Integer>> dfs(int[] nums, List<Integer> result, boolean[] flag, List<List<Integer>> results) {
        if (result.size() == nums.length) {
            results.add(new ArrayList<>(result));
            return results;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                result.add(nums[i]);
                flag[i] = true;
                dfs(nums, result, flag, results);
                flag[i] = false;
                result.remove(result.size()-1);
            }
        }
        return results;
    }
}
