class Solution {
    public int countAsterisks(String s) {
        String arr[] = s.split("\\|");
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                continue;
            }
            if(arr[i].contains("*")){
                for(char ch : arr[i].toCharArray()){
                    if(ch == '*'){
                        count++;
                    }
                }
            }
            else{
                continue;
            }
        }
        return count;
    }
}