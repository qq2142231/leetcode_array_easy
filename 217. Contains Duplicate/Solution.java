class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        
        if(length < 2 )
            return false ;
        
        Map map = new HashMap();
        
        for(int i = 0; i< length ;i++ )
            
            if(map.containsKey(nums[i]))
                return true ;
             else
                 map.put(nums[i],i);
        
        
        return false;
        
    }
}