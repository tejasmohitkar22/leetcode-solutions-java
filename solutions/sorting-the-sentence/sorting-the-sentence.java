class Solution {
    public String sortSentence(String s) {
        String []arr = s.split(" ");
        String []str = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        for(String st : arr){
            int i = Character.getNumericValue(st.charAt(st.length() - 1)) - 1;
            str[i] = st.substring(0, st.length() - 1);
        }

        int i =0;
        for(i = 0; i < str.length - 1; i++){
            sb.append(str[i]).append(" ");
        }
        sb.append(str[i]);
        return sb.toString();
    }
}