package demo;

public class Demo88 {

    public static void main(String[] args) {
        int[] A = {1,2,3,0};
        int[] B = {2};
        int m = 3;
        int n = 1;
        merge(A, m, B, n);
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        int index = A.length - 1;
        while (m != 0 && n != 0) {
            if (A[m - 1] > B[n - 1]) {
                A[index] = A[m - 1];
                m--;
            } else {
                A[index] = B[n - 1];
                n--;
            }
            index--;
        }
        while (index >= 0) {
            A[index] = B[n - 1];
            n--;
            index--;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
