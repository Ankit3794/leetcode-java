package leetcode;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 *
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaximumAverageSubArray1_643 {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        double avgAns = 0;

        for(int i=0; i<k; i++){
            currSum+= nums[i];
        }

        avgAns = currSum/k;

        for(int i=k; i< nums.length; i++){
            currSum += nums[i] - nums[i-k];
            avgAns = Math.max(avgAns, currSum/k);
        }
        return avgAns;
    }

    public static void main(String[] args) {
        MaximumAverageSubArray1_643 test = new MaximumAverageSubArray1_643();
        int[] nums = {0,4,0,3,2};
        System.out.println(test.findMaxAverage(nums, 1));
    }
}
