package leetcode;

/**
 * https://leetcode.com/problems/search-insert-position/
 * Given a sorted numsay of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *  Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 *  Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int presentIndex = performBinarySearch(nums, target);
        return presentIndex == -1 ? leastMaxIndex(nums, target) : presentIndex;
    }

    private int leastMaxIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[end] <= target) {
            return end + 1;
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    private int performBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAscOrder = nums[start] < nums[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            if(isAscOrder) {
                if (target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if(target > nums[middle]){
                    end = middle -1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInsertPosition_35 test = new SearchInsertPosition_35();
        int[] nums = {1,3,5,6};
        System.out.println(test.searchInsert(nums, 5));
        System.out.println(test.searchInsert(nums, 2));
        System.out.println(test.searchInsert(nums, 7));

    }

}
