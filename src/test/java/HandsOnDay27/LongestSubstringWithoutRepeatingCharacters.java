package HandsOnDay27;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String  s = "abba";

        System.out.println(longSubStr(s));

    }

    public static int longSubStr(String s){


        Map<Character,Integer> hmap = new HashMap<>();


        int maxLenght = 0;
        int left = 0 , right = 0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(hmap.containsKey(ch)){
                left = Math.max(hmap.get(ch)+1,left);
            }
            hmap.put(ch,right);
            maxLenght = Math.max(maxLenght,right-left+1);
            right++;
        }
             return maxLenght;
    }
}
