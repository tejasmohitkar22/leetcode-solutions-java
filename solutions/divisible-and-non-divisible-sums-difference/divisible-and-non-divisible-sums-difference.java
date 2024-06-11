class Solution {
    public int differenceOfSums(int n, int m) {
        int isDivisible = 0;
        int isNotDivisible = 0;
        for(int i = 0; i <= n; i++){
            if(i % m == 0){
                isDivisible = isDivisible + i;
            }
            else if(i % m != 0){
                isNotDivisible = isNotDivisible + i;
            }
        }
        return isNotDivisible - isDivisible;
    }
}