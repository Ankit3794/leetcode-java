package leetcode;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *  Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix_14 {

    private String getCommonPrefix(String s1, String s2){
        StringBuilder output = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());
        for(int i=0; i<length; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                output.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return output.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String output = getCommonPrefix(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            output = getCommonPrefix(output, strs[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 test = new LongestCommonPrefix_14();
        String[] strs = {"cir", "car"};
        System.out.println(test.longestCommonPrefix(strs));

    }

}
