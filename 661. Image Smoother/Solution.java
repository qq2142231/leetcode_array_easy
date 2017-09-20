class Solution {
    public int[][] imageSmoother(int[][] M) {
        
        int rlength = M.length , clength=M[0].length;
        int[][] smoothM = new int[rlength][clength];
        
      
        for(int i = 0 ; i < rlength ;i++)
            for(int j = 0 ; j < clength ; j++){
                      smoothM[i][j]=conv(M,i,j,rlength,clength);
            }
        
        return smoothM;
    }
    
    public int conv(int[][] M , int r ,int c,int rlimt,int climt){
        int sum = M[r][c] ,count = 1;        
        if( r>0 ){
            count++;
            sum += M[r-1][c];
            
            if( c>0 ){
                count++;
                sum += M[r-1][c-1];
            }
            
            if(c < climt-1){
                count++;
                sum += M[r-1][c+1];
            }
        }
        
        if(r < rlimt-1){
            count++;
            sum += M[r+1][c];
            
            if( c>0 ){
                count++;
                sum += M[r+1][c-1];
            }
            
            if(c < climt-1){
                count++;
                sum += M[r+1][c+1];
            }
            
            
        }
        
        if( c>0 ){
            count++;
            sum +=M[r][c-1];
        }
        
        if(c < climt-1){
            count++;
            sum +=M[r][c+1];
        }
     
        
        return sum/count;
        
        
        
    }
    
    
    
}