class Solution {
    public int arrayPairSum(int[] nums) {
       
        if(nums.length==2)
            return Math.min(nums[0],nums[1]);
        
        int sum = 0;
                  
        
       Sort(nums,0,nums.length-1);
        
        
        for(int i = 0 ; i < nums.length/2 ; i++)
        {                   
           
             sum +=nums[i*2];        
        }
        
        
        return sum;
    }
    
    
    
 public void Sort(int[] a, int p, int r) {
        if (p < r) {
            int q = Partition(a, p, r);
            Sort(a, p, q-1);
            Sort(a,q+1, r);            
        }
    }
    
    public int Partition(int[] A, int p, int r) {
        /*随机选取主元元素*/
        Random random = new Random();
        int random_index = random.nextInt(r-p+1)+p;
        int temp = A[random_index];
        A[random_index] = A[r];
        A[r] = temp;
        
        int x = A[r];  //pivot = A[p]
        int i = p-1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {  //与pivot作比较
                i++;
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
        }
        
        int tmp = A[r];
        A[r] = A[i+1];
        A[i+1] = tmp;
        
        return i+1;
        
    }
    
    
    
    
}