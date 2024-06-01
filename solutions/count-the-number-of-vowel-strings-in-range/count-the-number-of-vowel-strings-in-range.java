class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowels = "aeiou";
        int count = 0;
        for(int i = left; i <= right; i++){
            char ch = words[i].charAt(0);
            char ch1 = words[i].charAt(words[i].length()-1);
            if(vowels.contains(ch + "") && vowels.contains(ch1 + "")){
                count++;
            }
        }
        return count;
    }
}