package leetcode;

import java.util.*;

public class FindAllNumbersDisappearsInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> pairs = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(pairs.containsKey(nums[i])){
                pairs.put(nums[i], pairs.get(nums[i]) + 1);
            } else {
                pairs.put(nums[i], 1);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if(!pairs.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearsInAnArray_448 test = new FindAllNumbersDisappearsInAnArray_448();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(test.findDisappearedNumbers(nums));
    }
}
