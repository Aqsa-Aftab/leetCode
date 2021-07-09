class Solution {
    public int reverse(int x) {
        
       long result = 0;
        int signBit = x;
       
       
        
        if(x < 0){
            
           x = Math.abs(x);
        }
        
        while(x > 0){
            
            result = (result * 10 ) + (x % 10);
            x = x/ 10;
            
        }
        
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                    return 0;
        if(signBit < 0 )
            return (int) (result * -1);
        else
            return (int) result;
        
            
        
        
    
    }
}