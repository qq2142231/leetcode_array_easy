class Solution {
    public int maxProfit(int[] prices) {
       
        int length = prices.length;
       
        
        if( length == 0 || length == 1)
                 return 0;
        
        
        
         int maxprofit = 0 ;
        
         int minbuy =  prices[0]  ;
        
        for(int i = 1 ; i < length ; i++)
        {
                 if( minbuy < prices[i] ) 
                     
                     maxprofit = Math.max( maxprofit , prices[i] - minbuy ) ;  
            
                 else 
                 
                     minbuy = prices[i] ;                                                                  
        }
        
        
        return maxprofit ;
        
    }
    
    
 
}