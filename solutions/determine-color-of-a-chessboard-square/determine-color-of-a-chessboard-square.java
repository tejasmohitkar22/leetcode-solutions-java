class Solution {
    public boolean squareIsWhite(String coordinates) {
        int ch = (int)coordinates.charAt(0);
        int num = Character.getNumericValue(coordinates.charAt(1));
        if((ch % 2 == 0 && num % 2 == 0) || (ch % 2 != 0 && num % 2 != 0)){
            return false;
        }
        return true;
    }
}