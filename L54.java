class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int direction = 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = 0;
        
        while (spiral.size() < m*n) {
            if (direction == 0) {
                if (col == n || matrix[row][col] == 999) {
                    direction = 1;
                    col--;
                    row++;
                } else {
                    spiral.add(matrix[row][col]);
                    matrix[row][col] = 999;
                    col++;
                }
            } else if (direction == 1) {
                if (row == m || matrix[row][col] == 999) {
                    direction = 2;
                    row--;
                    col--;
                } else {
                    spiral.add(matrix[row][col]);
                    matrix[row][col] = 999;
                    row++;
                }
            } else if (direction == 2) {
                if (col == -1 || matrix[row][col] == 999) {
                    direction = 3;
                    col++;
                    row--;
                } else {
                    spiral.add(matrix[row][col]);
                    matrix[row][col] = 999;
                    col--;
                }
            } else if (direction == 3) {
                if (row == -1 || matrix[row][col] == 999) {
                    direction = 0;
                    row++;
                    col++;
                } else {
                    spiral.add(matrix[row][col]);
                    matrix[row][col] = 999;
                    row--;
                }
            }
        }
        
        return spiral;
    }
}