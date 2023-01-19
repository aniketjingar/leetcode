class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color){
            helper(image, sr, sc, color, originalColor);        
        }
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        if (image[sr][sc] == originalColor) {
            image[sr][sc] = color;
            helper(image, sr+1, sc, color, originalColor);
            helper(image, sr-1, sc, color, originalColor);
            helper(image, sr, sc+1, color, originalColor);
            helper(image, sr, sc-1, color, originalColor);
        }
    }
}