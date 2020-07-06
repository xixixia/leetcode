package demo;

import java.util.Arrays;

public class Demo66 {

    public static void main(String[] args) {
        int[] nums = {9,9};
        int[] result = plusOne(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        int next = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum=digits[i] + next;
            if (sum == 10) {
                digits[i] = 0;
                next = 1;
            } else {
                digits[i] = sum;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = next;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;
    }
}
