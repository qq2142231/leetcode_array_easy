class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        
        
        if(nums.length == 1)
            return nums[0];
        
        
        int max = 0, temp = 0;
        for(int i: nums)
        {
            temp += i;
            if(i==0)
            {
                max = Math.max(max,temp);
                temp = 0;
            }
           
        }
        
     return max > temp? max :temp ;
        
        
    }
}