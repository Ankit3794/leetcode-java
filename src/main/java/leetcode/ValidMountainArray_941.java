package leetcode;

public class ValidMountainArray_941 {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i+1 < n && arr[i] < arr[i+1]){
            i++;
        }

        if(i==0 || i == n-1){
            return false;
        }

        while(i+1 < n && arr[i] > arr[i+1]){
            i++;
        }
        return i == n-1;
    }

    public static void main(String[] args) {
        ValidMountainArray_941 test = new ValidMountainArray_941();
        int[] nums = {4,4,3,2,1};
        System.out.println(test.validMountainArray(nums));
    }
}
