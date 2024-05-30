class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int num = (char) ch;
            if(num >= 65 && num <= 90){
                ch = (char)(num + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}