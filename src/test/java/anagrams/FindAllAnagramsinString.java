package anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FindAllAnagramsinString {

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";

        System.out.println( findAnagrams(s,p));

    }

    public static List<Integer> findAnagrams(String s, String p) {

        int slen = s.length();
        int plen = p.length();
        List<Integer> anaNum = new ArrayList<>();

        Map<Character, Integer> pmap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(pmap);

        Map<Character, Integer> smap = new HashMap<>();
        for (int right = 0; right < slen; right++) {                           // 0
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);             // c=0 b=1 a=1 e =1
                                                                              //    0   1   2   3

            if (right >= plen) {
                char c = s.charAt(right - plen);
                smap.put(c, smap.get(c) - 1);
                if (smap.get(c) == 0) {
                    smap.remove(c);
                }
            }

            System.out.println(smap);

            if (smap.equals(pmap)) {
                anaNum.add(right - plen + 1);
            }
        }

        return anaNum;

    }
}
