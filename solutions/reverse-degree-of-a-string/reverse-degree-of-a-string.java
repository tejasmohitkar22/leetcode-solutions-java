class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        int count = 1;
        for(char ch : s.toCharArray()){
            degree += ('z' - ch + 1) * count++;
        }
        return degree;
    }
}