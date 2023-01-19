class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for(int i = 0;i < nums.length; i++){
            if(largest < nums[i]){
                sLargest = largest;
                largest = nums[i];
                maxIndex = i;
            }else if(sLargest < nums[i]){
                sLargest = nums[i];
            }
        }
        
        return nums[maxIndex]/2 >= sLargest ? maxIndex : -1 ;
    }
}