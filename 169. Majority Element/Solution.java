class Solution {
    public int majorityElement(int[] nums)  {
        
        
        int times = nums.length/2 + 1;
        
        if(times == 1 )
            return nums[0];
        
        Map map = new HashMap();
        
        for(int i = 0 ; i < nums.length ; i++)
        {  
            if(map.containsKey(nums[i]))
            {    
                int temp = (int)map.get(nums[i]) + 1 ;
                
                if(times == temp )
                {   
                    return nums[i];
                }
                else
                {
                    map.replace ( nums[i] , temp );
                }
            }
           else if( i < times)
           {
               map.put(nums[i],1);
           }
        }
        
     return 0;
    }
}