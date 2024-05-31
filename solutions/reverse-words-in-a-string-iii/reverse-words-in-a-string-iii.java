class Solution {
    public String reverseWords(String s) {
        String []arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for(i = 0; i < arr.length - 1; i++){
            sb.append(new StringBuilder(arr[i]).reverse()).append(" ");
        }
        sb.append(new StringBuilder(arr[i]).reverse());
        return sb.toString();
    }
}