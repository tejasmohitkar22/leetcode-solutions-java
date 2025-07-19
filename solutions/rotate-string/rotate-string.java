class Solution {
    public boolean rotateString(String s, String goal) {

        // for(int i = 0; i < s.length(); i++){
        //     String rotateString = s.substring(i) + s.substring(0, i);
        //     if(rotateString.equals(goal)) {
        //         return true;
        //     }
        // }
        // return false;

        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);

    }
}