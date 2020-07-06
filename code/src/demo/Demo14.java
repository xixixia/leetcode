package demo;

public class Demo14 {

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String result = "";
        boolean flag = false;
        for (int index = 0; index < strs[0].length(); index++) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return result;
                }
            }
            result += c;

        }
        return result;
    }

}
