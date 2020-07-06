package demo;

/**
 * 整数反转
 */
public class Demo07 {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        boolean flag = x > 0;
        x = Math.abs(x);
        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result>Integer.MAX_VALUE){
            return 0;
        }
        return (int) (flag ? result : -result);
    }
}
