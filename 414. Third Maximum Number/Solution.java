class Solution {
    public int thirdMax(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);


        int[] Judge = new int[]{nums[0],nums[1],nums[2]};


        three_element_sort(Judge);


        for(int i = 2 ; i < nums.length ; i++)
        {
            if(Judge[2]!=nums[i] && Judge[0] !=nums[i]  && Judge[1] != nums[i] )
                if(Judge[0]>Judge[1] && Judge[1] > Judge[2]) {
                    if (nums[i] > Judge[2]) {
                        Judge[2] = nums[i];
                        three_element_sort(Judge);
                    }
                }
                else if (Judge[0] == Judge[1] || Judge[0]==Judge[2])
                {
                     Judge[0]=nums[i];
                    three_element_sort(Judge);
                }
                else
                {
                    Judge[1]=nums[i];
                    three_element_sort(Judge);
                }
        }




        if(Judge[0]>Judge[1] && Judge[1] > Judge[2])
            return Judge[2];

        return Judge[0];


    }


    public void three_element_sort(int []nums)
    {

        for(int i = 0 ; i < 2 ; i ++ )
            for(int j = i+1 ; j < 3 ; j ++)
            {
                if(nums[i]<nums[j])
                {
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j] =temp;
                }
            }


    }
    
    
    
}