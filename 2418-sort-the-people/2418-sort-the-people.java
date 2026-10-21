class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < names.length - 1; i++){
            for(int j = i + 1; j < names.length; j++){
                if(heights[i] < heights[j]){
                    int num = heights[i];
                    heights[i] = heights[j];
                    heights[j] = num;
                    String name = names[i];
                    names[i] = names[j];
                    names[j] = name;
                }
            }
        }
        return names;
    }
}