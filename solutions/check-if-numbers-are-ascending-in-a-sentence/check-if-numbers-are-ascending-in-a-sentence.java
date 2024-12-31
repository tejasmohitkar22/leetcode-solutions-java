class Solution {
    public boolean areNumbersAscending(String s) {
        int lastValue = 0;
        for(String str : s.split(" ")){
            if(Character.isDigit(str.charAt(0))){
                if(lastValue >= Integer.valueOf(str)){
                    return false;
                }
                lastValue = Integer.valueOf(str);
            }
            
        }
        return true;
    }
}