class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = nums.clone();
        
        Arrays.sort(arr);
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < arr.length ; i++){
            
            if(!map.containsKey(arr[i])){
                
                map.put(arr[i] , i );
                
            }
            
            
            
        }
        
        int[] output = new int[arr.length];
        
        for(int j = 0 ; j < nums.length; j++ ){
            
            arr[j] = map.get(nums[j]);
            
            
        }
        
        return arr;
        
    }
}