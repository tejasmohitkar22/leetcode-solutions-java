class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String str = "";
        for(int i = index; i >= 0; i--){
            str = str + word.charAt(i);
        }
        str = str + word.substring(index+1, word.length());
        return str;
    }
}