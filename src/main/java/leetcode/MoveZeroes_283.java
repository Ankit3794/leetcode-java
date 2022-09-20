package leetcode;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes_283 test = new MoveZeroes_283();
        int[] nums = {0,1,0,3,12};
        test.moveZeroes(nums);
    }
}
