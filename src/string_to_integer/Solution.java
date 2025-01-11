package string_to_integer;

public class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()) return 0;
        long integer = 0;
        int sign = 1;
        int val;
        int i = 0;
        long result = 0;
        while (i < s.length() && s.charAt(i) == ' ') ++i;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (i < s.length() - 1 && (s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-'))
                return 0;
            sign = s.charAt(i) == '-' ? -1 : 1;
            ++i;
        }
        for (int j = i; j < s.length(); j++) {
            val = s.charAt(j);
            if (val < '0' || val > '9')
                break;
            else {
                integer = integer * 10 + val - '0';
                if (sign == 1 && integer > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign == -1 && -integer < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }
        result = sign * integer;
        return (int) result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("-042"));
    }
}
