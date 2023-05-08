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


    }

    public static boolean fndDistinct(int[] arr , int[] arr1) {
        // Create hash maps for the arrays
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        // Add array elements to hash maps
        for (int i = 0; i < arr.length; i++) {
            map1.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr1.length; i++) {
            map2.put(arr1[i], map2.getOrDefault(arr1[i], 0) + 1);
        }

        // Compare the hash maps
        boolean isSame = map1.equals(map2);


        return isSame;
    }


//    public static boolean fndDistinct(int[] arr , int[] arr1){
//
//        if (arr.length != arr1.length) {
//        return false;
//        }
//
//
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            map2.put(arr1[i],map1.getOrDefault(arr[i],0)+1);
//        }
//
//        boolean isSame = map1.equals(map2);
//        return isSame;
//    }


}
