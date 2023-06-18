package HandsOnDay26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class rodcolors {

    public static void main(String[] args) {

        String rings = "B0B6G0R6R0R6G9";

        System.out.println(countPoints(rings));

    }

    public static int countPoints(String rings) {
        Map<Character, Set<Character>> cmap = new HashMap<>();
        Set<Character> rodsWithAllColors = new HashSet<>();

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);

            if (!cmap.containsKey(rod)) {
                cmap.put(rod, new HashSet<>());
            }

            System.out.println(cmap.get(rod));
            cmap.get(rod).add(color);
       //    <0,[B,G,R]>
           //   <6,[B,R,G]>
            //   <9,[G]>
            if (cmap.get(rod).size() == 3) {
                rodsWithAllColors.add(rod);
               // 0,6
            }
        }


        return rodsWithAllColors.size();
    }
    }


