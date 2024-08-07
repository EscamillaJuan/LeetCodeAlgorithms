import two_sum.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {0, 1, 2, 4, 6, 7};
        int target = 3;
        int[] indexes = solution.twoSum(numbers, target);
        System.out.print("[");
        for(int index: indexes) System.out.print(index + ",");
        System.out.print("]");
    }
}
