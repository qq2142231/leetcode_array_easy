class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        
        if(n  == 0)
            return true;
        
        
        
        if( (flowerbed.length+1)/2 < n)
               return false;
        
       
        
        int length = flowerbed.length;
        
            if(n==1 && length==1 && flowerbed[0]==0)
                return true;
          
        
        int count = 1;
        for(int i:flowerbed){
            if(i == 0)
                count++;
            else{
                count = 0;
                continue;
            }
            if(count == 3){
                count = 1;
                n--;
            }
                          
             if(n==0)
                 return true;
            
    
        }
        
        if(length>2){
             if(count==2)
                 n--;
        }
        
        return n==0;
    }
    
}