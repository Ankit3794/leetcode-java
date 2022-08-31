package leetcode; /**
 * https://leetcode.com/problems/roman-to-integer/
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 *  Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int romanToInt = 0;
        for(int i = 0; i< s.length(); i++){
            boolean skipNextElementCheck = i == s.length()-1;
            if(!skipNextElementCheck && s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                romanToInt = romanToInt + romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                i++;
                continue;
            }
            if(!skipNextElementCheck && s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                romanToInt = romanToInt + romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                i++;
                continue;
            }
            if(!skipNextElementCheck && s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                romanToInt = romanToInt + romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                i++;
            } else {
                    romanToInt += romanValues.get(s.charAt(i));
            }
        }
        return romanToInt;
    }

    public static void main(String[] args) {
        RomanToInteger_13 test = new RomanToInteger_13();
        System.out.println(test.romanToInt("III"));
        System.out.println(test.romanToInt("LVIII"));
        System.out.println(test.romanToInt("MCMXCIV"));
    }
}
