package mandatoryHomeWork.week8.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

    public static void main(String[] args) {

        String strArr[] = {"ab","ab","abc"};
        String queries[] = {"ab","abc","bc"};

        sparArr(strArr,queries);

    }

    public static int[] sparArr(String[] gvn, String[] query){

        Map<String,Integer> hmap = new HashMap<>();

        for (String gvnStr  : gvn  ) {
            hmap.put(gvnStr,hmap.getOrDefault(gvnStr,0)+1);

        }

        int[] newArr = new int[query.length];

        for (int i = 0; i < query.length; i++) {


            if(hmap.containsKey(query[i])){
                newArr[i] = hmap.get(query[i]);
            }

        }


        System.out.println(Arrays.toString(newArr));

        return newArr;

    }
}
