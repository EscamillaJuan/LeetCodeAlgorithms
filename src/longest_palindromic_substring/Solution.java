package longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        if (s.isEmpty()) return "";
        for (int i = 0; i < s.length(); i++) {
            String odd_palindrome = expandAroundCenter(s, i, i);
            if (odd_palindrome.length() > longest.length()) {
                longest = odd_palindrome;
            }
            String even_palindrome = expandAroundCenter(s, i, i + 1);
            if (even_palindrome.length() > longest.length()) {
                longest = even_palindrome;
            }
        }
        return longest;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left -= 1;
            right += 1;
        }
        return s.substring(left + 1, right);
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestPalindrome("babad"));
    }
}
