package rework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        System.out.println(Arrays.toString(moveZeroes(nums)) );

    }

    private static int[] moveZeroes(int[] nums) {

        int left = 0 , right = 1 ;

        while (right<nums.length){
                if(nums[left]==0 && nums[right] != 0){

                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right++;
            }else{
               right++;
            }
        }
        System.out.println(left);
        return nums;
    }

}
