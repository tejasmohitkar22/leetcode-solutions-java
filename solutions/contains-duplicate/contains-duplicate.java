class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;
        if (nums.length == 2) return nums[0] == nums[1];
        Set<Integer> numSet = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());
        if(numSet.size() != nums.length){
            return true;
        }
        return false;
    }
}