class Solution {
    public void reverseString(char[] s) {
        
        char x = ' ';
        
        int n = s.length;
        int j = n-1;
        int i = 0;
        while(i < j){
            
            x = s[i];
           s[i] = s[j];
            s[j] = x;
            j--;
            i++;
            
        }
        
    }
}