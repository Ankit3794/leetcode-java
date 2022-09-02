package leetcode;

import java.util.Arrays;

/**
 * Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [7,2,5,10,8], m = 2
 * Output: 18
 * Explanation:
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 */
public class SplitArrayLargestSum_410 {
    public int splitArray(int[] nums, int m) {
        int start = Arrays.stream(nums).max().getAsInt();
        int end = Arrays.stream(nums).sum();

        while (start < end) {
            int middle = start + (end - start) / 2;
            int noOfPieces = getNoOfSubArraysWithSum(nums, middle);

            if (noOfPieces > m) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }

        return end;
    }

    private int getNoOfSubArraysWithSum(int[] nums, int sum) {
        int count = 1;
        int subArraySum = 0;
        for (int num : nums) {
            if (subArraySum + num > sum) {
                subArraySum = num;
                count++;
            } else {
                subArraySum += num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum_410 test = new SplitArrayLargestSum_410();
        int[] nums = {1,2,3,4,5};
        System.out.println(test.splitArray(nums, 2));
    }
}
