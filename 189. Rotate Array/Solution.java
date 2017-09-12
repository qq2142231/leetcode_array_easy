
class Solution {

    public void rotate(int[] nums, int k) {

        int length = nums.length ;

        if( length < 2 )
            return ;

        k = k % length ;

        if(k == 0)
            return ;



       int end =  maxCommonDivisor(length,k); 

            for(int j = 0 ; j < end ;j++ ) {

              int  temp1 = nums[j];

                for (int i = 1; i <= length / end; i++) {
                    int temp2 = nums[(i * k + j) % length];
                    nums[(i * k + j) % length] = temp1;
                    temp1 = temp2;
                }

            }




    }

    public  int maxCommonDivisor(int m, int n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {// 若余数为0,返回最大公约数
            return n;
        } else { // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonDivisor(n, m % n);
        }
    }


  
}

