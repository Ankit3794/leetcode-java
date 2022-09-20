package leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!numsList.contains(nums[i])){
                numsList.add(nums[i]);
            }
        }
        if(numsList.size() < 1){
            return 0;
        }
        int index = numsList.size() < 3 ? numsList.size() - 1 : numsList.size() -3;
        return numsList.get(index);
    }

    public static void main(String[] args) {
        ThirdMaximumNumber_414 test = new ThirdMaximumNumber_414();
        int[] nums = {2,2,3,1};
        System.out.println(test.thirdMax(nums));
    }
}
