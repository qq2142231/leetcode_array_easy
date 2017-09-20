class Solution {
    public int maximumProduct(int[] nums) {
        
        int[] min = new int[]{nums[0],nums[1]};
        int[] max = new int[]{nums[0],nums[1],nums[2]};
        
        minf(min,nums[2]);
        
        for(int i = 3; i<nums.length;i++)
        {
            minf(min,nums[i]);           
            maxf(max,nums[i]);
        }
    
        
        Arrays.sort(max);   
        return Math.max(min[0]*min[1]*max[2],max[0]*max[1]*max[2]);
        
    }
    
    public void minf(int[] nums,int temp){
        
        
        if(nums[1]<nums[0])
        {
            int k = nums[0];
            nums[0] = nums[1];
            nums[1] = k;
        }
        
        nums[1] = Math.min(nums[1],temp);
    }
    
    
    public void maxf(int[] nums,int temp){
        Arrays.sort(nums);
        nums[0] = Math.max(nums[0],temp);
        
    }
    
}