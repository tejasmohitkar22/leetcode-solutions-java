class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                flag++;
            }
            else{
                flag--;
            }
            if(flag == 0){
                count++;
            }
        }
        return count;
    }
}