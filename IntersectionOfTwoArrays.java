import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int i : nums1) hashSet1.add(i);
        for(int j : nums2) hashSet2.add(j);

        hashSet1.retainAll(hashSet2);
        // Retains only and all values in hashSet1 that are common with hashSet2
        
        int[] retArr = new int[hashSet1.size()];
        int index = 0;

        for(int x : hashSet1){
            retArr[index] = x;
            index++;
        }
        return retArr;
    }
}