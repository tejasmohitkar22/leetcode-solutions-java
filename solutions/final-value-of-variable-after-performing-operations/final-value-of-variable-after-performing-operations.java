class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int index = 0;
        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")){
                index++;
            }
            else{
                index--;
            }
        }
        return index;
    }
}