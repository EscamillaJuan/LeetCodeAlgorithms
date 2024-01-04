#include<iostream>
#include<string>

class Solution {
public:
    int lengthOfLongestSubstring(std::string s) {
        int s_size = s.size();
        if (s_size<=1) return s_size;
        int longest = 0, rigth = 0, left = 0;
        bool characters[256] = { false };
        while(rigth < s_size) {
            if(characters[s[rigth]]){
                while (characters[s[rigth]]) {
                characters[s[left]] = false;
                left++;
                }
            }
            characters[s[rigth]] = true;
            longest = std::max(longest, (rigth - left + 1));
            rigth++;
        }
        return longest;
    }
};

int main() {
    Solution sol;
    std::string s = "testingabcdeffrtdfg";
    std::cout << sol.lengthOfLongestSubstring(s) << "\n";
    return 0;
}