package longest_substring_without_repeating_character;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> char_map = new HashMap<>();
        int left_limit = 0, longest = 0;
        for (int right_limit = 0; right_limit < s.length(); right_limit++) {
            char current_char = s.charAt(right_limit);
            if (char_map.containsKey(current_char) && char_map.get(current_char) >= left_limit) {
                left_limit = char_map.get(current_char) + 1;
            }
            char_map.put(current_char, right_limit);
            longest = Math.max(longest, right_limit - left_limit + 1);
        }
        return longest;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}