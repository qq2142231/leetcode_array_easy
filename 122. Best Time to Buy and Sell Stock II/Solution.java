class Solution {
    public int maxProfit(int[] prices) {
        
        int length = prices.length ;
        
        if(length ==1 || length == 0)
               return 0 ;
        
        boolean hold = false ; 
        
        int maxprofit = 0 , sell = 0 , buy = 0;
        
        
        
        for(int i = 1 ; i < length ; i++)
        {
            if(hold)
             {
                
                if(sell > prices[i] )
                {                   
                       maxprofit +=  ( sell - buy ) ;
                       sell = buy = 0 ;
                       hold = false ;              
                }
               else
                {
                   
                       sell = prices[i] ;
                   
                }
                
            }
            else                
            {
                
                if(  prices[i-1] < prices[i] )
                {
            
                      sell = prices[i];
                      buy  = prices[i-1];
                      hold = true ;
                      
                }
                
            }                      
        }
        
       return maxprofit + sell - buy; 
        
    }
}