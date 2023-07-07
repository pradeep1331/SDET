package mandatoryHomeWork.week11.day2;

import java.util.HashMap;
import java.util.Map;

public class sherlockandString {

    public static void main(String[] args) {

        System.out.println(isValid("aabbcd"));

    }



    public static String isValid(String s) {
        // Write your code here
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
        if (frequencyCount.size() == 1 || frequencyCount.size() == 2 && frequencyCount.containsValue(1)) {
            return "YES";
        } else {
            return "NO";
        }

    }

}

