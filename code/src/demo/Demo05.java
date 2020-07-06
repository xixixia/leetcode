package demo;

/**
 * 动态规划
 * flag[i][j]表示第i个字符到第j个字符是否为回文串
 *
 */
public class Demo05 {

    public static void main(String[] args) {
        String str = "cccc";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        boolean[][] flag = new boolean[n][n];
        int maxLen = 1;
        int begin = 0;
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                if (len == 1) {
                    flag[i][i] = true;
                    continue;
                }
                if (s.charAt(i) == s.charAt(i + len - 1) && (len == 2 || flag[i + 1][i + len - 2])) {
                    flag[i][i + len - 1] = true;
                    flag[i + len - 1][i] = true;
                    if (len > maxLen) {
                        begin = i;
                        maxLen = len;
                    }
                }
            }
        }
        return s.substring(begin, begin + maxLen);


//        int n = s.length();
//        boolean[][] flag = new boolean[n][n];//记录第i个位置到第j个位置是否为回文串
//        int maxLen = 1;
//        int begin = 0;
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i <= j; i++) {
//                if (i == j) {
//                    flag[i][j] = true;
//                    continue;
//                }
////                if (s.charAt(i) == s.charAt(j) && j - i == 1) {
////                    flag[i][j] = true;
////                    if (2 > maxLen) {
////                        begin = i;
////                        maxLen = 2;
////                    }
////                    continue;
////                }
//                if (i + 1 < n && j - 1 >= 0) {
//                    if (s.charAt(i) == s.charAt(j) && (j - i == 1 || flag[i + 1][j - 1])) {
//                        flag[i][j] = true;
//                        flag[j][i] = true;
//                        if (j - i + 1 > maxLen) {
//                            begin = i;
//                            maxLen = j - i + 1;
//                        }
//                    }
//                }
//            }
//        }
//        return s.substring(begin, begin + maxLen);

    }

}
