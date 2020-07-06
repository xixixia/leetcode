package demo;

public class Demo994 {

    public static void main(String[] args) {
        int[][] grid = {
                {2},
                {1},
                {1},
                {1},
                {2},
                {1},
                {1},
        };
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int[][] time = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            time[i]=new int[grid[i].length];
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1){
                    time[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int result = 0;
        int maxTime = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    time[i][j] = Math.min(time[i][j], result);
                    result = Math.max(result, bfs(grid, i, j, time));
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                maxTime = Math.max(maxTime, time[i][j]);
            }
        }
        return maxTime;
    }

    private static int bfs(int[][] grid, int i, int j, int[][] time) {
        int result = 0;
        boolean flag = false;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            flag = true;
            grid[i][j - 1] = 2;
            time[i][j - 1] = Math.min(time[i][j - 1], result+1);
            result = Math.max(result, bfs(grid, i, j - 1, time));
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            flag = true;
            grid[i][j + 1] = 2;
            time[i][j + 1] = Math.min(time[i][j + 1], result+1);
            ;
            result = Math.max(result, bfs(grid, i, j + 1, time));
        }
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            flag = true;
            grid[i - 1][j] = 2;
            time[i - 1][j] = Math.min(time[i - 1][j], result+1);
            ;
            result = Math.max(result, bfs(grid, i - 1, j, time));
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
            flag = true;
            grid[i + 1][j] = 2;
            time[i + 1][j] = Math.min(time[i + 1][j], result+1);
            ;
            result = Math.max(result, bfs(grid, i + 1, j, time));
        }
        return flag ? result + 1 : result;
    }
}
