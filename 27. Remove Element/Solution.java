class Solution {
    public int removeElement(int[] nums, int val) {
        
        
   
        int d= 0;
        int len=0;
        if(nums == null)
            return 0;
        for(int i = 0; i+d<nums.length; i++)
        {
            if(nums[i]!=val)
                len++;
            else
            {
                while(i+d<nums.length)
                {
                    //swap
                    if(nums[i+d]!= val)
                    {
                    int temp = nums[i];
                    nums[i] = nums[i+d];
                    nums[i+d] = temp;
                    len++;
                        break;
                    }
                    else
                        d++;
                }
            }
        }
        return len;
      
        
    }
}