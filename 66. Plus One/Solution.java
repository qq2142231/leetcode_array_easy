class Solution {
    public int[] plusOne(int[] digits) {
        
        int length = digits.length-1;
       
        
        while(length >= 0){
        
        if(digits[length]==9)
        {  
             digits[length] = 0;
        }  
         else 
          {
            digits[length] += 1;
            return digits;
          }
            
            length--;
            
        }
        
        if(digits[0]==0)
        {
            int[] new_digits = new int[digits.length+1];
            new_digits[0]=1;
            return new_digits;
        }
        
        return null;
    }
    
    
}