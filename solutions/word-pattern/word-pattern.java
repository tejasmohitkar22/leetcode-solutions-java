class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> map = new HashMap<Character, String>();
        String arr[] = s.split(" ");

        if(pattern.length() != arr.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char key = pattern.charAt(i);
            String value = arr[i];
            if(map.containsKey(key)){
                if(!map.get(key).equals(value)){
                    return false;
                }
            }
            else{
                if(map.containsValue(value)){
                    return false;
                }
                map.put(key, arr[i]);
            }
        }
        return true;

    }
}