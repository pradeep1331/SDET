package HandsOnDay11;

import java.util.HashMap;
import java.util.Map;

public class distinctArray {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};
        System.out.println(fndDistinct(array1,array2));


        int[] array3 = {1, 2, 3, 3};
        int[] array4 = {4, 3, 2, 1};
        System.out.println(fndDistinct(array3,array4));

        int[] array5 = {1, 2, 3};
        int[] array6 = {4, 3, 2, 1};
        System.out.println(fndDistinct(array5,array6));

        int[] array7 = null;
        int[] array8 = {4, 3, 2, 1};
        System.out.println(fndDistinct(array7,array8));


    }

    public static boolean fndDistinct(int[] arr , int[] arr1) {
        if (arr == null || arr1==null || arr ==null || arr1 == null) {
            return false;
        }
        boolean flag = false;
        // Create hash maps for the arrays
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        // Add array elements to hash maps
        for (int i : arr) {
            map1.put(i, map2.getOrDefault(i, 0) + 1);
        }
        for (int j : arr1) {
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }
        // Compare the hash maps
         flag = map1.equals(map2);

        return flag;
    }


}
