package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 *  Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros_1089 {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                addZeroOnNextElement(arr, i);
                i++;
            }
        }
    }

    private void addZeroOnNextElement(int[] arr, int i) {
        for(int p = arr.length-1; p> i; p--){
            arr[p] = arr[p-1];
        }
    }

    public static void main(String[] args) {
        DuplicateZeros_1089 test = new DuplicateZeros_1089();
        int[] nums = {1,0,2,3,0,4,5,0};
        test.duplicateZeros(nums);
    }
}
