class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int index = nums[i];
            if(index == target){
                list.add(i);
            }
        }
        return list;
    }
}