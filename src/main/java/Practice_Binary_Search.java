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

    public char nextGreatestLetter(char[] arr, char target) {
        // return smallest integer >= target
        int start = 0;
        int end = arr.length - 1;
        if (arr[end] <= target) {
            return arr[start];
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
//            if (target == arr[middle]) {
//                return middle == arr.length - 1 ? arr[0] : arr[middle+1];
//            }
            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return arr[start];
    }

    public int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscOrder = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                return middle;
            }
            if(isAscOrder) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if(target > arr[middle]){
                    end = middle -1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice_Binary_Search test = new Practice_Binary_Search();

        char[] arr = {'c','f','g'};
        System.out.println(test.nextGreatestLetter(arr, 'a'));
        System.out.println(test.nextGreatestLetter(arr, 'c'));
        System.out.println(test.nextGreatestLetter(arr, 'g'));

        int[] ascNums = {1,3,4,6,8,10};
        int[] descNums = {10,9,6,4,3,1};

        System.out.println(test.orderAgnosticBinarySearch(ascNums, 4));
        System.out.println(test.orderAgnosticBinarySearch(ascNums, 10));
        System.out.println(test.orderAgnosticBinarySearch(ascNums, 12));
        System.out.println(test.orderAgnosticBinarySearch(descNums, 6));
        System.out.println(test.orderAgnosticBinarySearch(descNums, 4));
        System.out.println(test.orderAgnosticBinarySearch(descNums, 0));
    }
}
