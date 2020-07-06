package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo54 {

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4},
                {5, 6, 7, 8},
        };
        System.out.println(spiralOrder(nums));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = ((m < n ? m : n) + 1) / 2;
        for (int i = 0; i < count; i++) {
            if (i == n - 1 - i) {
                result.add(matrix[i][n - 1 - i]);
            }
            for (int j = i; j < n - 1 - i; j++) {
                result.add(matrix[i][j]);
            }
            for (int j = i; j < m - 1 - i; j++) {
                result.add(matrix[j][n - 1 - i]);
            }
            for (int j = n - 1 - i; j > i; j--) {
                result.add(matrix[m - 1 - i][j]);
            }
            for (int j = m - 1 - i; j > i; j--) {
                result.add(matrix[j][i]);
            }
        }
        return result;
    }

}
