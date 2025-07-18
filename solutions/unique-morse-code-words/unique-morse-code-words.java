class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        if(words.length == 1){
            return 1;
        }

        String str = ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
        String arr[] = str.split(",");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String moseCode = "";
            for(char ch : word.toCharArray()){
                moseCode = moseCode + arr[ch - 'a'];
            }
            map.put(moseCode, map.getOrDefault(moseCode, 0) + 1);
        }
        return map.keySet().size();

    }
}