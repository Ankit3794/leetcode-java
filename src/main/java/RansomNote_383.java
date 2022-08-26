import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> ransomNoteMap = getOccurrenceOfChars(ransomNote);
        Map<Character, Integer> magazineMap = getOccurrenceOfChars(magazine);

        for (Character entry : ransomNoteMap.keySet()) {
            if (!magazineMap.containsKey(entry)) {
                return false;
            }
            if (ransomNoteMap.get(entry) > magazineMap.get(entry)) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> getOccurrenceOfChars(String str) {
        Map<Character, Integer> charsMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charsMap.containsKey(currentChar)) {
                charsMap.put(currentChar, charsMap.get(currentChar) + 1);
            } else {
                charsMap.put(currentChar, 1);
            }
        }
        return charsMap;
    }

    public static void main(String[] args) {
        RansomNote_383 test = new RansomNote_383();
        System.out.println(test.canConstruct("aa", "ab"));
        System.out.println(test.canConstruct("a", "b"));
    }
}
