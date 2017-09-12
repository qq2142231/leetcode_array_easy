class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        if(n==0)
        {
            return ;
        }
       
        int i = 0 ;
        
        while(i<m)
        {
            
            if( nums2[0] < nums1[i]   )
            {   
                int temp = nums1[i];
                nums1[i] = nums2[0] ;
                nums2[0] = temp ;
                Arrays.sort(nums2);
            }
            
            i++;
            
        }
               
       
        for(int j = 0 ; j < n ; j++ )
        {
            nums1[j+m]=nums2[j];
        }
      
    }
    
   
    
}