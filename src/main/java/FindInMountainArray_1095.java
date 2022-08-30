/**
 * https://leetcode.com/problems/find-in-mountain-array/
 * You may recall that an array arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 *
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
 *
 * Example 1:
 *
 * Input: array = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 */

interface MountainArray {
    int get(int index);
    int length();
}

public class FindInMountainArray_1095 {
    private int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr.get(middle) > arr.get(middle+1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    private int orderAgnosticBinarySearch(MountainArray arr, int target, int start, int end){
        boolean isAscOrder = arr.get(start) < arr.get(end);
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr.get(middle)) {
                return middle;
            }
            if(isAscOrder) {
                if (target < arr.get(middle)) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if(target > arr.get(middle)){
                    end = middle -1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElementIndex = peakIndexInMountainArray(mountainArr);
        int elementToBeFound = orderAgnosticBinarySearch(mountainArr, target, 0, peakElementIndex);
        if(elementToBeFound == -1) {
            elementToBeFound = orderAgnosticBinarySearch(mountainArr, target, peakElementIndex + 1, mountainArr.length() -1);
        }
        return elementToBeFound;
    }

    public static void main(String[] args) {
        FindInMountainArray_1095 test = new FindInMountainArray_1095();
        System.out.println(test.findInMountainArray(0, null));
    }
}
