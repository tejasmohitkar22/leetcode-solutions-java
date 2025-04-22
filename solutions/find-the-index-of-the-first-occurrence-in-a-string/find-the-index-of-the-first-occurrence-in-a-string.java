class Solution {
    public int strStr(String haystack, String needle) {
        // int firstIndex = haystack.indexOf(needle);
        // int index = 0;
        // if(firstIndex == -1){
        //     return -1;
        // }
        // else{
        //     for(int i = firstIndex; i < haystack.length(); i++){
        //         if(index < needle.length()){
        //             if(haystack.charAt(i) == needle.charAt(index)){
        //                 index++;
        //             }
        //         }
        //         else {
        //             index = 0;
        //         }
        //     }
        //     return firstIndex;
        // }

        return haystack.indexOf(needle);
    }
}