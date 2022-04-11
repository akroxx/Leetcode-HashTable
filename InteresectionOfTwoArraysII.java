import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return intersect(nums2, nums1);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : nums1){
            hashMap.put(i, hashMap.getOrDefault(i, 0) +1);
        }

        int idx =0;
        for(int j : nums2){
            int count = hashMap.getOrDefault(j, 0);
            if(count > 0){
                nums1[idx++] = j;
                hashMap.put(j, count-1);                
            }
        }
        return Arrays.copyOfRange(nums1, 0, idx);
    }
}