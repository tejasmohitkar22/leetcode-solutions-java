class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !vowels.contains(s.charAt(left) + "")){
                left++;
            }
            while(left < right && !vowels.contains(s.charAt(right) + "")){
                right--;
            }

            char ch = s.charAt(left);
            sb.setCharAt(left, s.charAt(right));
            sb.setCharAt(right, ch);
            left++;
            right--;
            
        }
        return sb.toString();

    }
}