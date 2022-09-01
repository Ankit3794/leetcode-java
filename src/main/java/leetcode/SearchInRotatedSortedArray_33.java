package leetcode;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */
public class SearchInRotatedSortedArray_33 {
    private int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }
            if (arr[middle] <= arr[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    private int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscOrder = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            }
            if (isAscOrder) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int peakElementIndex = peakIndexInMountainArray(nums);
        int targetElementIndex;
        if (peakElementIndex == -1) {
            return orderAgnosticBinarySearch(nums, target, 0, nums.length - 1);
        }
        targetElementIndex = orderAgnosticBinarySearch(nums, target, 0, peakElementIndex);
        if (targetElementIndex == -1 && peakElementIndex != nums.length - 1) {
            targetElementIndex = orderAgnosticBinarySearch(nums, target, peakElementIndex + 1, nums.length - 1);
        }
        return targetElementIndex;

    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray_33 test = new SearchInRotatedSortedArray_33();
        int[] nums = {1, 3};
        System.out.println(test.peakIndexInMountainArray(nums));
        System.out.println(test.search(nums, 0));
    }
}
