class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String str : sentences){
            String arr[] = str.split(" ");
            if(max < arr.length){
                max = arr.length;
            }
        }
        return max;
    }
}