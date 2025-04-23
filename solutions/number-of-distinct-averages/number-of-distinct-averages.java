class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> unique = new HashSet<Double>();
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            double avg = (nums[left] + nums[right]) / 2.0;
            unique.add(avg);
            left++;
            right--;
        }
        return unique.size();
    }
}