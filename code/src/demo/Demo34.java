package demo;

public class Demo34 {

    public static void main(String[] args) {
        int[] nums = {7,7,7,7,7,7};
        int taget = 10;
        int[] ints = searchRange(nums, taget);
        System.out.println(ints[0] + "++++++++" + ints[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{fistOrLastIndex(true, nums, target), fistOrLastIndex(false, nums, target)};
    }

    public static int fistOrLastIndex(boolean flag, int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (flag) {
                    if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                        right = mid - 1;
                    } else {
                        return mid;
                    }
                } else {
                    if (mid + 1 <= nums.length - 1 && nums[mid] == nums[mid + 1]) {
                        left = mid + 1;
                    } else {
                        return mid;
                    }
                }
            }
        }
        return -1;
    }
}
