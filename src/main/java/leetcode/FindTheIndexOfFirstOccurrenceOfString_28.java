package leetcode;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindTheIndexOfFirstOccurrenceOfString_28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }

        if(haystack.equals(needle)){
            return 0;
        }

        int needleLength = needle.length();
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if(haystack.substring(i, needleLength + i).equals(needle)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindTheIndexOfFirstOccurrenceOfString_28 test = new FindTheIndexOfFirstOccurrenceOfString_28();
        System.out.println(test.strStr("abc", "c"));
    }
}
