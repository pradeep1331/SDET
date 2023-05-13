package HandsOnDay15;

import java.util.HashMap;

public class majorityEle {
    public static void main(String[] args) {
        int[] arr1 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr1));
    }

    public static int majorityElement(int[] arr){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int j : arr) {
            if (hmap.containsKey(j)) {
                hmap.put(j, hmap.get(j) + 1);
            } else {
                hmap.put(j, 1);
            }
        }
        int tar = arr.length/2;
        for (int j: hmap.keySet() ) {
                if(hmap.get(j)>tar) tar = j;
        }
        return tar;
    }
}