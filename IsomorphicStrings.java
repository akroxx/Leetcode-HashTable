import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Character> hashMap = new HashMap<>();
        HashSet<Character> assgnVals = new HashSet<>();

        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        
        for(int i =0; i< s.length(); i++){
            
            if(hashMap.containsKey(chs[i]) && hashMap.get(chs[i])!= cht[i]){                
                return false;
            }
            if( !hashMap.containsKey(chs[i]) && assgnVals.contains(cht[i])){
                return false;
            }
            hashMap.put(chs[i], cht[i]);
            assgnVals.add(cht[i]);
            
        }

        // boolean all = false;
        // for(int i =0; i <t.length(); i++){
        //     if(cht[i] == hashMap.get(chs[i])){
        //         all = true;
        //     }
        //     else return false;
        // }

        // if(all) return true;
        
        return true;
    }
}