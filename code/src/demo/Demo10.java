package demo;

/**
 * 正则表达式匹配
 */
public class Demo10 {

    public static void main(String[] args) {
        String s = "aa";
        String p = "a.";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] flag = new boolean[sLen + 1][pLen + 1];
        flag[0][0] = true;
        for (int j = 0; j < pLen; j++) {

        }
        for (int i = 0; i <= sLen; i++) {
            for (int j = 0; j <= pLen; j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    flag[i][j] = flag[i - 1][j - 1];
                } else if (p.charAt(j) == '*') {
                    if (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                        flag[i][j] = flag[i - 1][j - 1];
                    } else {
                        flag[i][j] = flag[i][j - 1];
                    }
                } else {
                    flag[i][j] = false;
                }
            }
        }
        return flag[sLen][pLen];
    }

}
