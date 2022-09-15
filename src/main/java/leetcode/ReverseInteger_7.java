package leetcode;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *  Example 1:
 * Input: x = 123
 * Output: 321
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        int y = 0;
        boolean negativeNum = x < 0;
        x = Math.abs(x);
        while(Math.abs(x)>0){
            int r = x%10;
            if(r + (double)y*10 > Integer.MAX_VALUE){
                return 0;
            }
            y = r + y*10;
            x = x/10;
        }
        return negativeNum ? y * -1 : y;
    }

    public static void main(String[] args) {
        ReverseInteger_7 test = new ReverseInteger_7();
        System.out.println(test.reverse(1534236469));
    }
}
