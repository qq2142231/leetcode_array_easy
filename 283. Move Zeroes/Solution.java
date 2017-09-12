class Solution {
    public void moveZeroes(int[] nums) {
        
        int length = nums.length ;
        
          
       
     
        for(int i = 0 ; i < length ; i++ )
            if(nums[i] == 0)
            {               
                int j = i + 1 ;
                while(j<length)
                {
                    if(nums[j] !=0 )
                    { 
                        nums[i]=nums[j] ;
                        nums[j] =  0 ;
                        break ;
                    }
                    j++ ;
                }
                
           if(j >= length)                
                break ;
                
            }
           
        
    }
}