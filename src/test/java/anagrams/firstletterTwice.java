package anagrams;

import java.util.HashMap;
import java.util.Map;

public class firstletterTwice {

    public static void main(String[] args) {

        String Str = "abccbaacz";
        System.out.println(getTwice(Str));

    }

    public static char getTwice(String str) {

        Map<Character, Integer> hmap = new HashMap<>(0);

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
            if (hmap.get(ch) > 1) {
                return ch;
            }
        }
        return 0;
    }

}
