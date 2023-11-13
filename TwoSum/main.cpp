#include<iostream>
#include<vector>
#include<unordered_map>


class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> result;
        for(int i=0; i<nums.size(); ++i){
            int complement = target - nums[i];
            auto it = result.find(complement);

            if(it!=result.end()){
                return {it->second, i};
            }else{
                result[nums[i]] = i;
            }
        }
        return {};
    }
};

int main(){
    Solution solution;
    int n = 0;
    std::cin>>n;
    std::vector<int>input;
    for(int i=0; i<n; i++){
        int num = 0;
        std::cin>>num;
        input.push_back(num);
    }
    int target = 0;
    std::cin>>target;
    std::vector<int> result = solution.twoSum(input, target);
    if(result.size()<=0){
        std::cout<<"[ ]";
    }
    else{
        std::cout<<"["<<result[0]<<","<<result[1]<<"]";
    }
}