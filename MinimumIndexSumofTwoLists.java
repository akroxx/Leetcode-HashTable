import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(int i =0; i <list1.length; i++){
            hashMap.put(list1[i], i);
        }
        // hashMap has all values from string'1

        List<String> retStr = new ArrayList<>();
        int sum;    //Local sum calculation
        int min_sum = Integer.MAX_VALUE;    //Maximum integer value to find minimum sum

        for(int j =0; j < list2.length; j++){
            if(hashMap.containsKey(list2[j])){
                sum = j + hashMap.get(list2[j]);
                if(sum < min_sum){
                    // If sum found is lesser, means higher priority then :
                    retStr.clear();
                    retStr.add(list2[j]);
                    min_sum = sum;
                }
                else if (sum == min_sum){
                    // Special case : where, both have same priority
                    retStr.add(list2[j]);
                    // No need to update min_sum since it is same
                }
            }
        }
        return retStr.toArray(new String[retStr.size()]);
    }
}