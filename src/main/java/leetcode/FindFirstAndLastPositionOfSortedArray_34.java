package leetcode;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class FindFirstAndLastPositionOfSortedArray_34 {
    public int findFirstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        if(target > nums[end] || target < nums[start]){
            return -1;
        }
        while(start <=end){
            int middle = start + (end-start)/2;
            if(nums[middle] < target){
                start = middle + 1;
            } else {
                end = middle -1;
            }
        }
        return nums[start] == target ? start : -1;
    }

    public int findLastOccurrence(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        if(target > nums[end] || target < nums[start]){
            return -1;
        }
        while(start <=end){
            int middle = start + (end-start)/2;
            if(nums[middle] > target){
                end = middle -1;
            } else {
                start = middle + 1;
            }
        }
        return nums[end] == target ? end : -1;
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfSortedArray_34 test = new FindFirstAndLastPositionOfSortedArray_34();
        int[] nums = {5,7,7,8,8,10};
        int[] output = new int[2];
        output[0] = nums.length >= 1 ? test.findFirstOccurence(nums, 1) : -1;
        output[1] = nums.length >= 1 ? test.findLastOccurrence(nums, 1) : -1;
    }
}
