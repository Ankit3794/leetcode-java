package leetcode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Example 2:
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 */
public class FindNumbersWithEvenNoOfDigits_1295 {

    public static void main(String[] args) {
        FindNumbersWithEvenNoOfDigits_1295 test = new FindNumbersWithEvenNoOfDigits_1295();

        int[] nums = {12,345,2,6,-7896};

        System.out.println(test.findNumbers(nums));
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int totalDigits = (int)Math.log10(Math.abs(num)) + 1;
            if(totalDigits %2 == 0){
                count++;
            }
        }
        return count;
    }
}
