package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/height-checker/
 */
public class HeightChecker_1051 {
    public int heightChecker(int[] heights) {
        int[] actual = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            actual[i] = heights[i];
        }
        Arrays.sort(heights);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != actual[i]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        HeightChecker_1051 test = new HeightChecker_1051();
        int[] nums = {5,1,2,3,4};
        System.out.println(test.heightChecker(nums));
    }
}
