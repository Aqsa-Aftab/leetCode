class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
      
        
        for(int i = 0; i < s.length(); i++){
            
              char x = s.charAt(i);
            
            if(x == '(' || x == '{'  || x == '[' )
                    stack.push(x);
            else if( x == ')' && !stack.empty() && stack.peek() == '(' ){
                stack.pop();
            }else if( x == '}' && !stack.empty() && stack.peek() == '{' ){
                stack.pop();
            }else if( x == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }
            else return false;
                                          
            
        }
                                          
        return stack.empty();
    }
}