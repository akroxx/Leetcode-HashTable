import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i =0; i < nums.length; i++){                       
            if(hashMap.containsKey(nums[i])){
                int diffAbs = Math.abs(i - hashMap.get(nums[i]));
                if(diffAbs <= k){                    
                    return true;
                }               
            }
            hashMap.put(nums[i], i);
        }        
        return false;
    }
}