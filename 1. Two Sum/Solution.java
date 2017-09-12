class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        
        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            for(int j=i+1; j < nums.length ; j++ )
                if( nums[i] + nums [j] == target )
                {
                    
                    return  new int[] {i,j};
                    
                }
        }
        
       throw new IllegalArgumentException("No such two elements");
    }
    
    public static void main(String args[]) 
        
        
    {
        
        int[] num = new int[] {3,2,4};
       
         
        twoSum(num,6);
        
    }
}