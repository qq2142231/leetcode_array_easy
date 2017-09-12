class Solution {
    public boolean checkPossibility(int[] nums) {
        
          boolean result = true;
          int length=nums.length;
          if(length == 1)
          {
              return result;
          }
        
            for(int i = 1 ; i < length ; i++)
            {  if( nums[i-1] <= nums[i] )
            {
                continue ;
            }
            else if(result)
            {
                result = false ;
                if(i!=1 && i!=length-1  )
                {

                   if( nums[i-2] > nums[i] && nums[i-1] > nums[i+1])
                   {
                        return result;
                   }
                }
            }

            else
            {
                return result;
            }




            }

            return true;
    }
}