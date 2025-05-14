import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        char mostCommon = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) continue;
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            if (countMap.get(c) > maxCount) {
                maxCount = countMap.get(c);
                mostCommon = c;
            }
        } 
        return mostCommon;
    }
}
