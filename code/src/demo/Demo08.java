package demo;

/**
 *  MAX_VALUE=2147483647
 *  MIN_VALUE=-2147483648
 */
public class Demo08 {

    public static void main(String[] args) {
        String str = "3141sadsa59";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int len = str.length();
        int index = 0;
        int result = 0;
        while (index < len && str.charAt(index) == ' ') {
            index++;
        }
        if (index == len) {
            return 0;
        }
        int sign = 1;
        char c = str.charAt(index);
        if (c == '+') {
            sign = 1;
            index++;
        } else if (c == '-') {
            sign = -1;
            index++;
        } else if (c < '0' || c > '9') {
            return 0;
        }
        for (int i = index; i < len; i++) {
            char curChar = str.charAt(i);
            if (curChar >= '0' && curChar <= '9') {
                if (sign == 1 && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && curChar >= '7'))) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && curChar >= '8'))) {
                    return Integer.MIN_VALUE;
                }
                result = result * 10 + curChar - '0';
            }else {
                break;
            }
        }
        return result * sign;
    }

}
