class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        boolean[] numsb = new boolean[nums.length+1];
        
        List result = new ArrayList();
        
        for(int i : nums)
        {
            numsb[i] = true;
        }
        
        numsb[0] = true;
        int j = 0;
        for(boolean judge :  numsb )
        {
            
            if(!judge)
                result.add(j);
            j++;
                
        }
        
        return result;
    }
}