class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        List<String> temp;
        List<List<String>> result = new ArrayList<>();
        int key [];
            
        for(String s: strs){

            key = new int[26];
        
            for(char c : s.toCharArray()) key[c-'a']++;

            String strKey  = Arrays.toString(key);   //102021100...

            // map.computeIfAbsent(strKey, k -> new ArrayList<>()).add(s);
           
            map.putIfAbsent(strKey, new ArrayList<>());
            map.get(strKey).add(s);

            // if(map.containsKey(strKey)){

            //    temp = map.get(strKey);
            //    temp.add(s);
            //    map.put(strKey,temp);
                 
            // }else{
            //     temp = new ArrayList<>();
            //     temp.add(s);
            //     map.put(strKey,temp);
            // }
        }

        //  for(List<String> list : map.values()) result.add(list);
            
        return new ArrayList<>(map.values());
    }
}
