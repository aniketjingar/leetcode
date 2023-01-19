class Solution {
    public int closedIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        for (int i=0;i<r;i++){
            markWater(grid, i, 0);
            markWater(grid, i, c-1);
        }

        for (int j=0;j<c;j++){
            markWater(grid, 0, j);
            markWater(grid, r-1, j);
        }

        int numOfClosedIslands = 0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (grid[i][j] == 0) {
                    numOfClosedIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numOfClosedIslands;

    }

    public void markWater(int[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 1) {
            return;
        }

        grid[i][j] = 1;
        markWater(grid, i+1, j);
        markWater(grid, i-1, j);
        markWater(grid, i, j+1);
        markWater(grid, i, j-1);
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 1) {
            return;
        }

        grid[i][j] = 1;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}