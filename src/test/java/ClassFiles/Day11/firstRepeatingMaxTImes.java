package ClassFiles.Day11;

import java.util.HashMap;

public class firstRepeatingMaxTImes {


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6, 3, 4, 4};

        System.out.println(maxTimeRepeat(arr));

    }

    private static int maxTimeRepeat(int[] arr){

        HashMap<Integer,Integer> hmapOccurance = new HashMap<>();

        for (int i : arr) {
            hmapOccurance.put(i,hmapOccurance.getOrDefault(i,0)+1);
        }
        int currMaxOccurance = 0;
        int smallestIndex = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(hmap.containsKey(ele)){
                int currentIndex = hmap.get(ele);
                int currentOccurrence = hmapOccurance.get(ele);
                if (currentOccurrence > currMaxOccurance && currentIndex < smallestIndex) {
                    currMaxOccurance = currentOccurrence;
                    smallestIndex = currentIndex;
                }
            } else {
                hmap.put(ele, i);
            }
            }
        return smallestIndex + 1;
        }


    }

