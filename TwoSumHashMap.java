import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int idx = 0;
        for(int i : nums){
            hashMap.putIfAbsent(i,idx);
            idx++;
        }

        for(int i =0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement) != i){
                return new int[] {i, hashMap.get(complement)};
            }
        }
        return null;
    }
}