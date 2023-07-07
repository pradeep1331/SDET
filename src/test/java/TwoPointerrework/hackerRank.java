package TwoPointerrework;

import java.util.HashMap;
import java.util.Map;

public class hackerRank {
    public static void main(String[] args) {

        System.out.println(isValid("aabbccddeefghi"));
    }

    public static String isValid(String s) {
        // Create a map to store the frequency of each character in the string
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);

        // Count the frequency of frequencies
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int frequency : frequencyMap.values()) {
            frequencyCount.put(frequency, frequencyCount.getOrDefault(frequency, 0) + 1);
        }

        System.out.println(frequencyCount);

        // If there is only one frequency or all frequencies are the same, the string is valid
        if (frequencyCount.size() == 1 ) {
            return "YES";
        } else if (frequencyCount.size() == 2 && frequencyCount.containsValue(1)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
