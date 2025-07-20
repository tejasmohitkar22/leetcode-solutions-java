class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int arr[] = new int[26];
        int count = 0;

        for(char ch : allowed.toCharArray()){
            arr[ch - 'a'] = 1;
        }

        for(int i = 0; i < words.length; i++){
            int flag = calculateConsistency(allowed, words[i]);
            if(flag == 1){
                count++;
            }
        }
        return count;
    }

    public int calculateConsistency(String allowed, String word){
        int flag = 0;
        for(char ch : word.toCharArray()){
            if(!allowed.contains(ch+"")){
                flag = 0;
                break;
            }
            flag = 1;
        }
        return flag;
    }

}