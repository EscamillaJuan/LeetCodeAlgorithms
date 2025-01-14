package palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        int copy = x, number = 0, inverse = 0;
        while (x != 0) {
            number = Math.abs(x) % 10;
            inverse = inverse * 10 + number;
            x = x / 10;
        }
        return copy == inverse;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}