import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        char arr[] = s.toCharArray();
        for(char ch : arr){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }
            else{
                hashMap.putIfAbsent(ch, 1);
            }
        }

        for(int j =0 ; j < arr.length; j++){
            if(hashMap.get(arr[j]) == 1){
                return j;
            }
        }
        return -1;
    }
}