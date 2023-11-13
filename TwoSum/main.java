import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for(int i=0; i<nums.length; ++i){
            int complement = target - nums[i];
            if(result.containsKey(complement)){
                return new int[]{result.get(complement), i};
            }else {
                result.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];
        for(int i=0; i<n; i++){
            input[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] result = solution.twoSum(input, target);
        if(result.length<=0){
            System.out.println("[ ]");
        }else{
            System.out.println("[" + result[0] + "," + result[1] + "]");
        }
    }
}