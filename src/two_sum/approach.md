## Two sum

### Description

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:  
Input: nums = [2,7,11,15], target = 9  
Output: [0,1]  
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:  
Input: nums = [3,2,4], target = 6  
Output: [1,2]

Example 3:  
Input: nums = [3,3], target = 6  
Output: [0,1]


#### Constraints:
```2 <= nums.length <= 10^4```  
```-10^9 <= nums[i] <= 10^9```  
```-10^9 <= target <= 10^9```  
Only one valid answer exists.  

Description provided by LeetCode.

### Approach

To solve this problem, an algorithm with a complexity of O(n) was implemented. The input to the function is an array of
numbers and a target number. Therefore, we can traverse the array once and keep track of the differences between the
target number and each number in the array. To store these differences, we use a hash map where we store the number as
the key and the index as the value. This ensures a search complexity of O(1), allowing us to find the target among the
stored differences, thus obtaining the indices that satisfy the condition.

