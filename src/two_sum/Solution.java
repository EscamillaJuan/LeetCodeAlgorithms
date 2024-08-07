package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i < numbers.length; i++) {
            numsMap.put(numbers[i], i);
        }
        for(int i=0; i < numbers.length; i++) {
            int desiredNum = target - numbers[i];
            Integer desiredIndex = numsMap.get(desiredNum);
            if (desiredIndex != null && desiredIndex != i) {
                return new int[]{i, desiredIndex};
            }
        }
        return null;
    }
}
