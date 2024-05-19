class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String strWord1 = "";
        String strWord2 = "";
        for(String word : word1){
            strWord1 = strWord1 + word;
        }
        for(String word : word2){
            strWord2 = strWord2 + word;
        }
        return strWord1.equals(strWord2);
    }
}