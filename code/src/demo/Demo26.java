package demo;

public class Demo26 {

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        while (j<nums.length){
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }
}
