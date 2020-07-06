package demo;

/**
 * 滑动窗口
 * 初始左右指针为0，右指针不断向右移动，直至出现同样字母（即count[i]>0）
 * 则左指针往右移
 */
public class Demo03 {

    public static void main(String[] args) {
        String str = "abca bcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int left = 0;
        int right = 0;
        int result = 0;
        while (right < s.length()) {
            int c = s.charAt(right) - ' ';
            while (count[c] > 0) {
                count[s.charAt(left) - ' ']--;
                left++;
            }
            right++;
            count[c]++;
            result = Math.max(result, right - left);
        }
        return result;
    }

}
