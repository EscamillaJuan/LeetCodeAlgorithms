package median_of_two_sorted_arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len2 < len1) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int l = 0, h = len1;
        while (l <= h) {
            int mid1 = (l + h) / 2;
            int mid2 = (len1 + len2 + 1) / 2 - mid1;

            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int right1 = (mid1 == len1) ? Integer.MAX_VALUE : nums1[mid1];

            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right2 = (mid2 == len2) ? Integer.MAX_VALUE : nums2[mid2];

            if (left1 <= right2 && left2 <= right1) {
                if ((len1 + len2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            }

            if (left1 > left2) {
                h = mid1 - 1;
            } else {
                l = mid1 + 1;
            }
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
    }
}