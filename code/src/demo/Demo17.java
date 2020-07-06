package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo17 {



    private static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        String digits = "23";
        letterCombinations(digits);
        ArrayList list = new ArrayList();
    }

    private static void dfs(String digits, int index, Map<Character, String> map, String s) {
        if (index >= digits.length()) {
            result.add(s);
            return;
        }
        char c = digits.charAt(index);
        for (int i = 0; i < map.get(c).length(); i++) {
            s += map.get(c).charAt(i);
            dfs(digits, index + 1, map, s);
            s = s.substring(0, s.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits == null || digits.length() == 0) {
            return result;
        }
        dfs(digits, 0, map, "");
        return result;

    }

}
