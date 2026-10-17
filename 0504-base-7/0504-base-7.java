class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if(num == 0){
            return "0";
        }

        int realNum = num;
        num = Math.abs(num);

        while(num > 0){
            int rem = num % 7;
            sb.append(rem);
            num =num / 7;
        }
        if(realNum < 0){
            sb.append("-");
        }
        return sb.reverse().toString();
        
    }
}