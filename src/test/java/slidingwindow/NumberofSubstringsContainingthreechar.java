package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class NumberofSubstringsContainingthreechar {

    public static void main(String[] args) {

         String  s = "abcabc";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0, start = 0, end = 0;
        int n = s.length();
        while (end < n) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.getOrDefault('a', 0) > 0
                    && map.getOrDefault('b', 0) > 0
                    && map.getOrDefault('c', 0) > 0) {
//                System.out.println(end);
                count += n - end;
                c = s.charAt(start);
                map.put(c, map.get(c) - 1);
                start++;
            }
            System.out.println(count);
            end++;
        }
        System.out.println(count);
    }
}
