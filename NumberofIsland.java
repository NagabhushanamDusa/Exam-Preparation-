package InfosysExam;

public class NumberofIsland {
	    static void dfs(int[][] grid, int r, int c) {
	        int rows = grid.length;
	        int cols = grid[0].length;

	        if (r < 0 || c < 0 || r >= rows ||
	            c >= cols || grid[r][c] == 0) {
	            return;
	        }

	        grid[r][c] = 0;

	        dfs(grid, r + 1, c);
	        dfs(grid, r - 1, c);
	        dfs(grid, r, c + 1);
	        dfs(grid, r, c - 1);
	    }

	    public static void main(String[] args) {
	        int[][] grid = {
	            {1, 1, 0, 0},
	            {0, 1, 0, 1},
	            {1, 0, 0, 1}
	        };

	        int count = 0;

	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid[0].length; j++) {

	                if (grid[i][j] == 1) {
	                    count++;
	                    dfs(grid, i, j);
	                }
	            }
	        }
	        System.out.println(count);
	    }
	}

