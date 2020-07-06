package demo;

public class Demo28 {

    public static void main(String[] args) {
        String text = "ababcabdabcabca";
        String pat = "abc";
        System.out.println(strStr(text, pat));
//        int[] next = next(pat);
//        for (int i = 0; i < next.length; i++) {
//            System.out.println(next[i]);
//        }
    }

    public static int[] next(String p) {
        int[] next = new int[p.length()];
        next[0] = -1;
        next[1] = 0;
        int k = 0;
        int j = 1;
        while (j < p.length() - 1) {
            if (p.charAt(k) == p.charAt(j)) {
                next[j + 1] = k + 1;
                j++;
                k++;
            } else if (k == 0) {
                next[j + 1] = 0;
                j++;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 || haystack.length() == 0) {
            return -1;
        }
        int[] next = next(needle);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            while (j < needle.length()) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    j = next[j];
                    break;
                }
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
