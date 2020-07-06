package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo57 {

    public static void main(String[] args) {
        int target = 9;
        int[][] list = findContinuousSequence(target);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] findContinuousSequence(int target) {
        //{1,2,3,4,5,6,7,8,9}
        List<int[]> results = new ArrayList<>();
        int i = 1;
        int j = 2;
        while (i < j && j <= target / 2 + 1) {
            int sum = (i + j) * (j - i + 1) / 2;
            if (sum > target) {
                i++;
            } else if (sum < target) {
                j++;
            } else {
                int[] result = new int[j - i + 1];
                for (int k = 0; k < result.length; k++) {
                    result[k] = i + k;
                }
                results.add(result);

                i++;
            }
        }
        return results.toArray(new int[0][]);

    }
}
