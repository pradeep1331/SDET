import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandsOnDay26 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

      twoSum(nums,6);

    }

    public static int[] twoSum(int[] nums,int target){

        Map<Integer,Integer> complementMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            Integer compIndex = complementMap.get(nums[i]);

            if(compIndex!=null) {

                return new int[]{compIndex,i};
            }
            complementMap.put(target-nums[i],i);


        }

        return nums;
    }






}
