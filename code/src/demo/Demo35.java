package demo;

public class Demo35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target>nums[nums.length-1]){
            return nums.length;
        }
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return target;
            }
            if (nums[i]>target){
                return i;
            }
        }

        return result;
    }
}
