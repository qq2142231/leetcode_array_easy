class Solution {
    public List<List<Integer>> generate(int numRows) {
        
            List<List<Integer>> Triangle = new ArrayList<List<Integer>>();
        if(numRows == 0)
        {
            return Triangle;
        }
        else
        {      
             SubGen(numRows,Triangle);
        }
        
        
        return Triangle;
        
        
        
        
    }
    
    
    public List<Integer> SubGen(int numRows,List<List<Integer>> Triangle)
    {
        List<Integer> nums = new ArrayList<Integer>();
        
        if(numRows == 1)
        {          
            nums.add(0,1);
            Triangle.add(numRows-1,nums);
            return nums;
        } 
        
        
        List<Integer> up_nums = SubGen(numRows-1,Triangle);
        for(int i = 0 ; i < numRows ; i++)
        {
            if(i == 0 || i == numRows-1  )
            {
                nums.add(i,1);
            }
            else
            {
                nums.add(i,up_nums.get(i)+up_nums.get(i-1));
            }
        }
        
        Triangle.add(numRows-1,nums);
        return nums;
        
        
        
    }
}