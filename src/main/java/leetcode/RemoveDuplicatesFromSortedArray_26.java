package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for(int j=i+1; j<length-1; j++){
                    nums[j] = nums[j+1];
                }
                length--;
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(length);
        return length;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray_26 test = new RemoveDuplicatesFromSortedArray_26();
        int[] nums = {1,1,2};
        test.removeDuplicates(nums);
    }
}
