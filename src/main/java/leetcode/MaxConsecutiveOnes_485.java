package leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *  Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int ans = 0;

        for(int right = 0; right< nums.length; right++){
            if(nums[right] == 1){
                curr++;
            } else {
                curr = 0;
            }

            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
