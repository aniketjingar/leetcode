class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        
        int m = mat.length;
        int n = mat[0].length;
        
        int row = 0;
        int column = 0;
        
        int direction = 1;
    
        
        int[] answer = new int[m*n];
        int index = 0;
        
        while(row<m && column<n) {
            
            answer[index++] = mat[row][column];
            
            int newRow = row + (direction == 1 ? -1: 1);
            int newColumn = column + (direction == 1 ? 1: -1);
            
            if (newRow < 0 || newRow == m || newColumn < 0 || newColumn == n) {
                if (direction == 1) {
                    row = row + (column == n-1 ? 1 : 0);
                    column = column + (column < n-1 ? 1 : 0);
                } else {
                    column += (row == m - 1 ? 1 : 0);
                    row += (row < m - 1 ? 1 : 0);
                }
                direction = 1 - direction;
            } else {
                row = newRow;
                column = newColumn;
            }
        }
        
        return answer;
    }
}