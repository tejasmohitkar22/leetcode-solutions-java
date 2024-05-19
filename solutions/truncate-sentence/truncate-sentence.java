class Solution {
    public String truncateSentence(String s, int k) {
        if(s.length() == k){
            return s;
        }
        String arr[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        str.append(arr[0]);
        for(int i = 1; i < k; i++){
            str.append(" " + arr[i]);
        }
        return str.toString();
    }
}