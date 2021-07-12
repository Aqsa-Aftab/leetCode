class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        Set<Character> map = new HashSet<Character>();
        int count = 0;
        for(char x: jewels.toCharArray()){
            
            map.add(x);
            
        }
        
        for(char y : stones.toCharArray()){
            
            if(map.contains(y)){
                
                count++;
            }
            
            
        }
        
        return count;
        
        
    }
}