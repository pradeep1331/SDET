package ClassFiles.Day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindMaximumNumberString {

    public static void main(String[] args) {

        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));

    }

    private static int maximumNumberOfStringPairs(String[] arr){

        int pairs = 0;

        Map<String,Integer> hmap = new HashMap<>();


        for (String str:arr ) {

         char[] arr1 =  str.toCharArray();
            Arrays.sort(arr1);
            String sortedString = new String(arr1);
            hmap.put(sortedString,hmap.getOrDefault(sortedString,0)+1);

        }

        int maxEle = 1;

        for (int num: hmap.values()
             ) {

            maxEle = Math.max(maxEle,num);
        }

        return maxEle;

    }
}
