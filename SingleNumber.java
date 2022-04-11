import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        // Create hashTable
        HashMap<Integer, Integer> hashTable = new HashMap<>();

        // Store all Integer elements in hashtable 
        // getOrDefault simply returns second arg passed i.e. default value if the first arg i.e key is
        // not found in the hashTable
        // At every iteration, the hashTable basically stores the frequency of the integer i being input in
        // the hashTable

        for(int i : nums){
            hashTable.put(i, hashTable.getOrDefault(i, 0) + 1 );
        }

        // For whichever element, the frequency of appearance in the Integer array is once, simply return element
        for(int i : nums){
            if(hashTable.get(i)==1) return i;
        }
        return 0;
    }
}