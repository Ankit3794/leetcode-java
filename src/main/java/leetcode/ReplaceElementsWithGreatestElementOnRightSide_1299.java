package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceElementsWithGreatestElementOnRightSide_1299 {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = arr[length-1];
        arr[length-1] = -1;
        for(int i=length-2; i>=0; i--){
            int temp = arr[i];
            arr[i]= max;
            max = Math.max(max, temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide_1299 test = new ReplaceElementsWithGreatestElementOnRightSide_1299();
        int[] nums = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(test.replaceElements(nums)));
    }
}
