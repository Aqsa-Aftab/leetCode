class Solution {
    public boolean isPalindrome(int x) {
        
        if( x < 0)
        {
            return false;
        }   
           
        int rem = x ;
            int sum = 0;
            
            while( x > 0)
            {
                sum = sum * 10 + x % 10;
                x = x / 10;
                
            }
            
            if( rem == sum )
                return true;
            
      return false;
    }
}