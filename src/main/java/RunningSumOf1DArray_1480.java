/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 *  Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

import java.util.Arrays;

public class RunningSumOf1DArray_1480 {

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1DArray_1480 test = new RunningSumOf1DArray_1480();

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(test.runningSum(nums)));
    }

}
