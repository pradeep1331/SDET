package slidingwindow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sherlockandanagrams {

    public static void main(String[] args) {

        sherlockAndAnagrams("abba");

    }

    public static void sherlockAndAnagrams(String s) {
        int n = s.length();
        int counter = 0;

        Map<String ,Integer> hmap = new HashMap<>();



        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                char[] arr =  s.substring(i,j+1).toCharArray();
                 Arrays.sort(arr);
                 String str = new String(arr);
                hmap.put(str,hmap.getOrDefault(str,0)+1);
            }

        }
        System.out.println(hmap);

        for ( int val   : hmap.values()  ) {
            counter += (val * (val - 1)) / 2;
        }
        System.out.println(counter);
    }
}
