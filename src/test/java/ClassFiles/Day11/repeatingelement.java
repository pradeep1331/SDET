package ClassFiles.Day11;

import java.util.HashMap;

public class repeatingelement {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(repeatingEle(arr));
    }
    public static int repeatingEle(int[] arr){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(hmap.containsKey(ele)){
            int currentIndex =  hmap.get(ele);
            smallestIndex = Math.max(currentIndex,smallestIndex);
            }else{
                hmap.put(ele,i);
            }
        }
       return smallestIndex;
    }
}