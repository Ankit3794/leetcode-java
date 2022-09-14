package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length1 = nums1.length;
        int left = 0,right=0;

        while(left < length1 && right < n) {
            if ((nums1[left] > nums2[right]) || (nums1[left] ==0)) {
                for (int p = m; p >= left; p--) {
                    if(p+1 < length1) {
                        nums1[p + 1] = nums1[p];
                    }
                }
                nums1[left] = nums2[right];
                right++;
                m++;
            }
            left ++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray_88 test = new MergeSortedArray_88();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        test.merge(nums1, 3, nums2, 3);
    }
}
