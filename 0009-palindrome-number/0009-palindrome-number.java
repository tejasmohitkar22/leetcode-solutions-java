class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if(String.valueOf(x).equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}