package leetcode;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * An array arr a mountain if the following properties hold:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 *
 * You must solve it in O(log(arr.length)) time complexity.
 * Example 1:
 *
 * Input: arr = [0,1,0]
 * Output: 1
 */
public class PeekIndexInAMountain_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        PeekIndexInAMountain_852 test = new PeekIndexInAMountain_852();
        int[] nums = {1,5,7,10,6,5,2};
        System.out.println(test.peakIndexInMountainArray(nums));
    }
}
