class Solution {
    public int maxSubArray(int[] nums) {
        
        int length = nums.length;
        
        int sum = nums[0];
        
        if(length == 1)
            return sum;
        
        int temp =0;
            
        for(int i = 0 ;i < length ; i++  )
        {
             temp +=nums[i];
            if(temp > sum)
                sum = temp;
            if(temp < 0)
                temp = 0; 
        }
        
        return sum;
            
    }
}