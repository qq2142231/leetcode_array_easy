class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int length = nums.length;
        
        if(length == 0 )
              return 0 ;
        
        if(target<nums[0])
              return 0;
        
        if(nums[length-1]<target )
              return length ;
            
       return subf(nums,target,0,length);
                                
      }
    
    
    public int subf(int[] nums,int target,int left, int right)
    {
        int mid = (left+right)/2;
        
        if(nums[mid]==target)
            return mid;
        
        if(left == right - 1  )
            return right;
        
        
        if(nums[mid] < target )
            return subf(nums,target,mid,right);
        else
             return subf(nums,target,left,mid);
         
       
    }
    
}