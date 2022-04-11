class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();

        HashMap<String, List> hashMap = new HashMap<String, List>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if( !hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList());
            }
            hashMap.get(key).add(s);
        }
        return new ArrayList(hashMap.values());
    }
}