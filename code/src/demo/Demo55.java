package demo;

public class Demo55 {

    public static void main(String[] args) {
        int[] nums = {3,0,8,2,0,0,1};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        boolean[] temp = new boolean[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = true;
        }
        return canJumpFun(nums, 0, temp);
    }

    public static boolean canJumpFun(int[] nums, int index, boolean[] temp) {
        if (index >= nums.length - 1) {
            return true;
        }
        if (temp[index] == false) {
            return false;
        }
        boolean flag = false;
        for (int i = nums[index]; i > 0; i--) {
            flag = canJumpFun(nums, index + i, temp);
            if (flag) {
                return true;
            } else {
                temp[index] = false;
            }
        }
        return false;
    }
}
