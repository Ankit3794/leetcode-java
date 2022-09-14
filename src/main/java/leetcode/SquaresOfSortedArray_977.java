package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */
public class SquaresOfSortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        int i=0;
        int j=l-1;
        for(int p=l-1; p>=0; p--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[p] = nums[i]*nums[i];
                i++;
            }else {
                result[p] = nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray_977 test = new SquaresOfSortedArray_977();
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(test.sortedSquares(nums)));
    }
}
