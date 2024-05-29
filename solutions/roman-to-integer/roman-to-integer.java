class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        MutableInt i = new MutableInt(0);

        while (i.value < s.length()) {
            char ch = s.charAt(i.value);
            sum += getNum(ch, i, s);
        }

        return sum;
    }

    public static int getNum(char ch, MutableInt i, String s) {
        int sum = 0;

        switch (ch) {
            case 'I':
                if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'V') {
                    sum = 4;
                    i.value++;
                } else if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'X') {
                    sum = 9;
                    i.value++;
                } else {
                    sum = 1;
                }
                break;
            case 'V':
                sum = 5;
                break;
            case 'X':
                if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'L') {
                    sum = 40;
                    i.value++;
                } else if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'C') {
                    sum = 90;
                    i.value++;
                } else {
                    sum = 10;
                }
                break;
            case 'L':
                sum = 50;
                break;
            case 'C':
                if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'D') {
                    sum = 400;
                    i.value++;
                } else if (i.value + 1 < s.length() && s.charAt(i.value + 1) == 'M') {
                    sum = 900;
                    i.value++;
                } else {
                    sum = 100;
                }
                break;
            case 'D':
                sum = 500;
                break;
            case 'M':
                sum = 1000;
                break;
        }

        i.value++;
        return sum;
    }

    public static class MutableInt {
        public int value;

        public MutableInt(int value) {
            this.value = value;
        }
    }
}
