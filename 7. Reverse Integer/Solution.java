class Solution {
    public int reverse(int x) {
        
  
        
        
       
        int result = 0;
      while(x !=0) {
          
          int temp = x % 10 ;
         int t_result = result*10 +  temp ;               
           
          
           if(t_result/10 != result )
           { 
               return 0;
           }
          
           result = t_result ;
          
           x /= 10;
       }
        
        
     
        
        
        return result;
    }
}