class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();
        List<Integer> currRow = new ArrayList<>();
        
        currRow.add(1);
        answer.add(currRow);
        
        for (int i=1;i<numRows;i++) {
            prevRow = currRow;
            currRow = new ArrayList<>();
            currRow.add(1);
            for (int j=1;j<prevRow.size();j++) {
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            answer.add(currRow);
        }
        
        return answer;
    }
}