package demo;

/**
 * 双指针
 */
public class Demo11 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,8, 8,1};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int rigth = height.length - 1;
        int result = 0;
        while (left < rigth) {
            result = Math.max(result, (rigth - left) * Math.min(height[left], height[rigth]));
            if (height[left]<height[rigth]){
                left++;
            }else {
                rigth--;
            }
        }
        return result;
    }
}
