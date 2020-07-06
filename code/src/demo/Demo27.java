package demo;

public class Demo27 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int val = 0;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] == val) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        return i;
    }

}
