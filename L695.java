class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j, 0));
                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int r, int c, int area) {
        if (r<0 || r>=grid.length || c<0 || c>=grid[0].length) {
            return area;
        }

        if (grid[r][c] == 1) {
            grid[r][c] = 0;
            area += 1;
            area = dfs(grid, r+1, c, area);
            area = dfs(grid, r, c+1, area);
            area = dfs(grid, r-1, c, area);
            area = dfs(grid, r, c-1, area);
        }
        
        return area;
    }
}