package TwoPointerrework;

import dev.failsafe.internal.util.Maths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestPositive2441 {

    public static void main(String[] args) {

           int[] gvn = {-1,10,6,7,-7,1};

        System.out.println(lPositive(gvn));

    }

    public static int lPositive(int[] gvn){

        Arrays.sort(gvn);
        Map<Integer,Integer> hmap = new HashMap<>();

        int max = -1;

        for ( int gvnint :gvn  ) {

            if(hmap.containsKey(gvnint*-1)){

                max = Math.max(max, Math.abs(gvnint));

            }
            hmap.put(gvnint,0);

        }
        return max;
    }
}
