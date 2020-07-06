package demo;

import java.util.Arrays;

/**
 *
 */
public class Demo06 {

    public static void main(String[] args) {
        String str = "LEETCODEISHIRING";
        System.out.println(convert(str, 2));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] strs = new String[numRows];
        Arrays.fill(strs, "");
        boolean flag = true;
        String result = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (flag) {
                strs[k] += c;
                k++;
            } else {
                strs[k] += c;
                k--;
            }
            flag = k == 0 ? true : flag;
            flag = k == numRows - 1 ? false : flag;
        }
        for (int i = 0; i < strs.length; i++) {
            result += strs[i];
        }
        return result;
    }

}
