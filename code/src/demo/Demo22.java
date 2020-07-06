package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        int left = n;
        int right = n;
        help("", left, right, results);
        return results;
    }

    public static List<String> help(String s, int left, int right, List<String> results) {
        if (left == 0 && right == 0) {
            results.add(s);
            return results;
        }
        if (left <= right) {
            if (left != 0) {
                help(s + "(", left - 1, right, results);
            }
            if (right!=0){
                help(s + ")", left, right - 1, results);
            }
        }
        return results;
    }
}
