class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int tempSum;
        for (int i = 0; i < accounts.length; i++) {
            tempSum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                tempSum += accounts[i][j];
            }
            if (tempSum > max) {
                max = tempSum;
            }
        }
        return max;
    }
}
