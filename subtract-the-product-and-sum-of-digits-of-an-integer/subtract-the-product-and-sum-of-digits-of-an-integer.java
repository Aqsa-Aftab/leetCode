class Solution {
    public int subtractProductAndSum(int n) {
        
        int product = 1;
        int sum = 0;
        int r = 0;
        while(n > 0){
            
            r = n % 10 ; 
            n = n / 10;
            product = product * r;
            sum = sum + r ;
            
            
            
        }
        
        int result = product - sum;
        return result;
        
        
    }
}