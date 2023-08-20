package anagrams;

import java.util.HashMap;
import java.util.Map;

public class leet242ValidAnagram {


    public static void main(String[] args) {

        String  s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s,t));

    }


    public static boolean isAnagram(String s, String t) {

        int n = s.length();
        int tlen = t.length();
        if(n!=tlen){
            return false;
        }

        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }

        return smap.equals(tmap);

    }
}
