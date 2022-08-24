/**
 * https://leetcode.com/problems/find-peak-element/
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * You must write an algorithm that runs in O(log n) time.
 */
public class Practice_Binary_Search {
    public int ceilingOfNum(int[] arr, int target) {
        // return smallest integer >= target
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return target;
            }
            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        Practice_Binary_Search test = new Practice_Binary_Search();
        int[] nums = {1, 4, 6, 8, 13, 30};
        System.out.println(test.ceilingOfNum(nums, 10));
    }
}
