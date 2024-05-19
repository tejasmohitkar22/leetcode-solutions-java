class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;
        for(int arr[] : accounts){
            int total = 0;
            for(int i : arr){
                total = total + i;
            }
            if(total > richest){
                richest = total;
            }
            total = 0;
        }
        return richest;
    }
}