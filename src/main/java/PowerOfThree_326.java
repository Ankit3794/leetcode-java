/**
 * https://leetcode.com/problems/power-of-three/
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 *
 * Example 1:
 * Input: n = 27
 * Output: true
 */
public class PowerOfThree_326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfThree_326 test = new PowerOfThree_326();
        System.out.println(test.isPowerOfThree(27));
        System.out.println(test.isPowerOfThree(15));
    }
}
