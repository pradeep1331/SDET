package HandsOnDay27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sherlockHOmes {


    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("cdcd"));

    }

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int start = 0; start < s.length(); start++) {
            for (int end = start + 1; end <= s.length(); end++) {
                char[] arr = s.substring(start, end).toCharArray();
                Arrays.sort(arr);
                String str = new String(arr);
                if (map.containsKey(str)) {
                    count += map.get(str);
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
        return count;
    }
}
