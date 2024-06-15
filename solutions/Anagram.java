package solutions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false;
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            if (frequencyMap.get(c) == 0) {
                frequencyMap.remove(c);
            }
        }

        return frequencyMap.isEmpty();
    }

}
