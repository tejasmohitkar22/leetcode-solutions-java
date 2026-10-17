class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s == "" || s == " "){
            return false;
        }
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int value = map.get(s.charAt(0));

        for(Integer v : map.values()){
            if(value != v){
                return false;
            }
        }
        return true;
    }
}