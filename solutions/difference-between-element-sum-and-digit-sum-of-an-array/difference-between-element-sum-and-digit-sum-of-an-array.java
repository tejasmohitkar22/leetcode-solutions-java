class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = Arrays.stream(nums).sum();
        int digitSum = Arrays.stream(nums)
                             .mapToObj(String::valueOf)
                             .flatMapToInt(s -> s.chars().map(Character::getNumericValue))
                             .sum();
        return Math.abs(elementSum - digitSum);
    }
}