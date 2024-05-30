class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        Set<Character> set = new HashSet<Character>();
        for(char ch : sentence.toCharArray()){
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}