class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> uniqueMap = new HashMap<String, Integer>();
        int count = 0;

        for(String str : arr){
            uniqueMap.put(str, uniqueMap.getOrDefault(str, 0) + 1);
        }
        for(String str : arr){
            if(uniqueMap.get(str) == 1){
                count++;
            }
            if(count == k){
                return str;
            }
        }
        return "";
    }
}