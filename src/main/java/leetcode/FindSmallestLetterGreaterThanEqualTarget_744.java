package leetcode;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
 * Note that the letters wrap around.
 * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 *
 * Example 1:
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 */
public class FindSmallestLetterGreaterThanEqualTarget_744 {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[end] <= target) {
            return arr[start];
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanEqualTarget_744 test = new FindSmallestLetterGreaterThanEqualTarget_744();

        char[] arr = {'c', 'c', 'f','g'};
        System.out.println(test.nextGreatestLetter(arr, 'a'));
        System.out.println(test.nextGreatestLetter(arr, 'c'));
        System.out.println(test.nextGreatestLetter(arr, 'g'));
        System.out.println(test.nextGreatestLetter(arr, 'x'));
    }
}
