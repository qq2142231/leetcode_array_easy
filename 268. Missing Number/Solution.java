class Solution {
    public int missingNumber(int[] nums) {
        
        
                
        int sum = 0;
        for(int num : nums)
            sum +=num;
                                   
        return (nums.length+1)*nums.length/2 - sum;
        
    }
}