package demo;

public class Demo36 {

    public static void main(String[] args) {
        char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                if (board[r][c] != '.' && !isValidate(board, r, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidate(char[][] board, int r, int c) {
        boolean flag = true;
        for (int i = 0; i < board.length; i++) {
            if (r == i) {
                continue;
            }
            if (board[r][c] == board[i][c]) {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (c == j) {
                continue;
            }
            if (board[r][c] == board[r][j]) {
                return false;
            }
        }
        int i_begin = r / 3 * 3;
        int j_begin = c / 3 * 3;
        int i_end = r / 3 * 3 + 3;
        int j_end = c / 3 * 3 + 3;
        for (int i = i_begin; i < i_end; i++) {
            for (int j = j_begin; j < j_end; j++) {
                if (r == i && c == j) {
                    continue;
                }
                if (board[r][c] == board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
