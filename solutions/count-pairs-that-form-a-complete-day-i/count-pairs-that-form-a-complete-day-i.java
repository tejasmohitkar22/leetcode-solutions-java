class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int pair = 0;
        for(int i = 0; i < hours.length -1; i++){
            for(int j = i + 1; j < hours.length; j++){
                int day = hours[i] + hours[j];
                if(day % 24 == 0){
                    pair++;
                }
            }
        }
        return pair;
    }
}