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
 */
public class FindNumbersWithEvenDigits_1295 {
    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        for(int i=0; i< nums.length; i++){
            if(getDigits(nums[i]) % 2 == 0){
                evenDigits++;
            }
        }
        return evenDigits;

    }

    private int getDigits(int num){
        int counter = 0;
        while(num > 0){
            num = num/10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        FindNumbersWithEvenDigits_1295 test = new FindNumbersWithEvenDigits_1295();
        int[] nums = {123,345,2,6,7896};
        System.out.println(test.findNumbers(nums));
    }
}
