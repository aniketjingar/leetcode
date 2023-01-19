class Solution {

    int seaCell = 0;
    int landCell = 1;

    public int numEnclaves(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;

        for (int i=0;i<row;i++) {
            markSeaCell(grid, i, 0);
            markSeaCell(grid, i, column-1);
        }

        for (int j=0;j<column;j++) {
            markSeaCell(grid, 0, j);
            markSeaCell(grid, row-1, j);
        }
        
        int numOfEnclaves = 0;

        for (int i=0;i<row;i++) {
            for (int j=0;j<column;j++) {
                if (grid[i][j] == landCell) {
                    numOfEnclaves += markSeaCell(grid, i, j);
                }
            }
        }

        return numOfEnclaves;
    }

    public int markSeaCell(int[][] grid, int r, int c) {
        if (r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c] == seaCell) {
            return 0;
        }

        grid[r][c] = seaCell;
        return 1 + 
            markSeaCell(grid, r+1, c) + 
            markSeaCell(grid, r, c+1) + 
            markSeaCell(grid, r-1, c) + 
            markSeaCell(grid, r, c-1);
    }
}