class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     
        List<Boolean> list = new ArrayList<Boolean>();
        
        int max = 0;
        
        for(int i : candies){
            
            if(max < i){
                
                max = i;
            }
            
        }
        
        
        for(int x : candies ){
            
            if( x + extraCandies >= max){
                
                list.add(true);
            }
            else
                list.add(false);
            
            
        }
        
        return list;
        
        
        
    }
}