class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            StringBuilder sb = new StringBuilder(str);
            if(str.equals(sb.reverse().toString())){
                return str;
            }
        }
        return "";
    }
}