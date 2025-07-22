class Solution {
    public int maxFreqSum(String s) {
        int maxConsonant = 0;
        int maxVowels = 0;
        int arr[] = new int[26];
        String vowels = "aeiou";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;

            if(vowels.indexOf(ch) != -1){
                maxVowels = Math.max(maxVowels, arr[ch - 'a']);
            }
            else{
                maxConsonant = Math.max(maxConsonant, arr[ch - 'a']);
            }
        }
        return maxVowels + maxConsonant;
    }
}