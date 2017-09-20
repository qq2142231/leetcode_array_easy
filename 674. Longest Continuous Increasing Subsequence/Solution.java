class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        if( nums.length == 0 ||nums == null)
            return 0;
        
        int max = 1,temp = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                temp++;
            }
            else{
                max=max>temp?max:temp;
                temp = 1;
            }
                
        }
        
        return max>temp?max:temp;
        
    }
}