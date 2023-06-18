package mandatoryHomeWork.week3.day5;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,1};  int target = 3;

        System.out.println(cntDup(arr1,target));
    }

    //COndition if 1 is present in 0 and agin present in 3 0 -3 is 3 hence passed
    //Loop through array and store indices
    // if again seen and difference is k then return true
    //else add in map
    //initialize as false
           //  [1,2,3,1,2,3]
           //   0 1 2 3 4 5
    public static boolean cntDup(int[] arr,int k){
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(!hmap.containsKey(arr[i])){

                hmap.put(arr[i],i);

                // k=1 v=0
                // k = 2 1
                // k = 3 2
                // k = 1
            }
            else {
               if(Math.abs((hmap.get(arr[i])-i))==k) return true;
               else hmap.put(arr[i],i);
            }

        }

        return false;

    }
}
