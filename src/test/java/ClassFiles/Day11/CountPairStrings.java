package ClassFiles.Day11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountPairStrings {

    public static void main(String[] args) {

        String[] arr = {"aabb","ab","ba"};
        System.out.println(similarPairs(arr));
    }



        public static int similarPairs(String[] words) {
            Map<String, Integer> countMap = new HashMap<>();

            for (String str : words) {
                Set<Character> charSet = new HashSet<>();

                for (char ch : str.toCharArray()) {
                    charSet.add(ch);
                }

                String key = charSet.toString();

                countMap.put(key, countMap.getOrDefault(key, 0) + 1);
            }

            int pairs = 0;
            for (int val : countMap.values()) {
                if (val > 1) {
                    pairs++;
                }
            }

            return pairs;
        }

    }

