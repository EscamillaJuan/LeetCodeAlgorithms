package reverse_integer;

public class Solution {
    public int reverse(int x) {
        int digit = 0;
        long reverse = 0;
        while (x != 0) {
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverse;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(123));
    }
}