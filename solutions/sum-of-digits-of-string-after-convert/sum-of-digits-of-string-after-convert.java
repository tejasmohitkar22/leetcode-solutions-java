class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(char str : s.toCharArray()){
            int value = Math.abs((str - 'a') + 1);
            sum = sum + calculateSum(value);
            System.out.println("Sum of character values: " + value);
        }
        System.out.println("Sum of character sum: " + sum);
        if(k == 1){
            return sum;
        }
        else{
            for(int i = 1; i < k; i++){
                sum = calculateSum(sum);
            }
            return sum;
        }
    }

    public int calculateSum(int sum){
        int total = 0;
        while (sum > 0){
            total = total + (sum % 10);
            sum = sum/10;
        }
        return total;
    }
}