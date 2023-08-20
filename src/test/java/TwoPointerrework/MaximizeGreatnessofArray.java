package TwoPointerrework;

import java.util.Arrays;

public class MaximizeGreatnessofArray {

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,1,3,1};

        System.out.println(getmaxGreat(nums));
    }

      public static int getmaxGreat(int[] nums){


           Arrays.sort(nums);

           int min = nums[0];

             int count = 0;

          for (int val : nums) {
              if(val > min){
                  count++;
              }
          }

          return count;



      }
}
