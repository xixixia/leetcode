package demo;

/**
 * 回文数
 */
public class Demo09 {

    public static void main(String[] args) {
        int x = 1001000;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int revertNum = 0;
        while (revertNum < x) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}
