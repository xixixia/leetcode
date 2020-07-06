package demo;

public class Demo70 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
