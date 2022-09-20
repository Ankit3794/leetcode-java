package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0 && i != nums.length-1){
                int nextEvenNo = findNextEvenNum(nums, i+1); //where i+1 is start index to search
                if(nextEvenNo != -1){
                    int temp = nums[nextEvenNo];
                    for (int j = nextEvenNo; j >i ; j--) {
                        nums[j] = nums[j-1];
                    }
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    private int findNextEvenNum(int[] nums, int startIndex) {
        for (int i = startIndex; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SortArrayByParity_905 test = new SortArrayByParity_905();
        int[] nums = {0};
        System.out.println(Arrays.toString(test.sortArrayByParity(nums)));
    }
}
