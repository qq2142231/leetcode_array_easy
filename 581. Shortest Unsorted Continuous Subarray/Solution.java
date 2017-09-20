class Solution {
    public int findUnsortedSubarray(int[] nums) {


        if(nums.length<2)
            return 0;

        int start = 0,end =nums.length-1  , length = nums.length;
        boolean switch1 = false, switch2 = false ;
        for(int i = 1 ;i < length ; i++){
            if(nums[i-1] <= nums[i] && !switch1){
                start = i;
            }
            else if(!switch1){
                switch1 = true;

            }
            if(nums[length-i-1] <= nums[length - i] && !switch2){
                end = length - i -1;
            }
            else if(!switch2){
                switch2 = true;
            }

            if(switch1&&switch2){
                break;
            }

        }


        if(start -  end + 1 == length )
            return 0;

        int max = nums[start], min = nums[start] ;
        for(int i = 0; i < end - start + 1 ; i++ ){
            if(max < nums[i+start]){
                max = nums[i + start];
            }
            if(min > nums[i+start]){
                min = nums[i + start];
            }
        }

        for(int i = start ,j = end;switch1 || switch2; )
        {
            if(switch1) {
                if (nums[i] > min) {
                    start = i;
                }
                else
                {
                    switch1 = false;
                }
            }
            if(switch2) {
                if (nums[j] < max) {
                    end = j;
                }
                else {
                    switch2 = false;
                }
            }
            if(j==length-1&&switch2)
                switch2 =false;
            if (i==0&&switch1)
                switch1 =false;

            if(switch1 && i !=0)
                i--;
            if(j!=length-1 &&switch2)
                j++;


        }

        return   end - start + 1;




    }
}