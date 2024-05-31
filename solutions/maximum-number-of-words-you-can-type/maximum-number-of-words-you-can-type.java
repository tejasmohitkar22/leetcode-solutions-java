class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []arr = text.split(" ");
        int count = arr.length;
        for(String str : arr){
            for(char ch : brokenLetters.toCharArray()){
                if(str.contains(ch+"")){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}