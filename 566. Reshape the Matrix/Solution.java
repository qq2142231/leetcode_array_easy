class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        
    
        if(nums.length*nums[0].length != r*c)
             return nums;
        
        int[][] matrix = new int[r][c];
        
        int i = 0 , j = 0;
        for(int[] temp_nums:nums)
            for(int temp:temp_nums){
            if(i < c){
                matrix[j][i] = temp ;
                i++;
            }
            else{
                j++;
                i = 0;
                matrix[j][i]=temp;
                i++;
            }
        }
        
        return matrix;
    }
}