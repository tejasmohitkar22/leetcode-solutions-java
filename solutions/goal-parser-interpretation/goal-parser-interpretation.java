class Solution {
    public String interpret(String command) {
        int index = 0;
        String str1 = "(al)";
        String str2 = "()";
        StringBuilder newStr = new StringBuilder(command);
        while ((index = newStr.indexOf(str1, index)) != -1) {
            newStr.replace(index, index + str1.length(), "al");
        }
    
        index = 0;
        while ((index = newStr.indexOf(str2, index)) != -1) {
            newStr.replace(index, index + str2.length(), "o");
        }
        return newStr.toString();
    }
}