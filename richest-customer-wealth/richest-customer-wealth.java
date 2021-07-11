class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int max = 0;
        int sum = 0;
        
        for(int[] i  : accounts){
            
            for(int x : i){
                
                sum = sum + x ;
                
                
            }
            
          
            if(max< sum){
                max = sum;
            }
              sum = 0;
            
        }
        
        return max;
        
    }
}