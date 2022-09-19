package leetcode;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
public class CheckIfNAndItsDoubleExists_1346 {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i !=j && arr[i] == 2* arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfNAndItsDoubleExists_1346 test= new CheckIfNAndItsDoubleExists_1346();
        int[] nums = {3,1,7,11};
        System.out.println(test.checkIfExist(nums));
    }
}
