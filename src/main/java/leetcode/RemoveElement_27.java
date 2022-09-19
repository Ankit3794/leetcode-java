package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i< length; i++){
            if(nums[i] == val){
                for (int j = i; j < length -1; j++) {
                    nums[j] = nums[j+1];
                }
                i--;
                length--;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        RemoveElement_27 test = new RemoveElement_27();
        int[] nums = {0,1,2,2,3,0,4,2};
        test.removeElement(nums, 2);
    }
}
