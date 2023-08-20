package ClassFiles.Day11;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstNonRepeatChar {

    public static void main(String[] args) {
        String  s1 = "lets code";
        String s2 = "love to code. lets code";
        String s3 = "ooove to code. lets code";
        System.out.println(nonRepeat(s1));
        System.out.println(nonRepeat(s2));
        System.out.println(nonRepeat(s3));


    }
    private static int nonRepeat(String s) {
        LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hmap.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}
