package BinaryProblems;

import java.util.Arrays;

public class FirstandLastPosition {

    public static void main(String[] args) {

       int[] nums = {5,7,7,8,8,10} ; int target = 8;


        System.out.println(Arrays.toString( fLMthd(nums,target)));

    }

    private static int[] fLMthd(int[] nums, int target){


        int[] ans = {-1,-1};

        int start = firstOccurance(nums,target,true);
        int end = firstOccurance(nums,target,false);

        ans[0] = start;
        ans[1] = end;


   return ans;


    }

    public static int firstOccurance(int[] nums, int target,boolean firstoccr){

        int start = 0 , end = nums.length-1; int ans = -1;

        while (start<=end){

            int mid = start + (end -start)/2;

            if(target<nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid +1;

            }else{
                ans = mid;
                if(firstoccr){
                    end = mid-1;
                }else {
                            start = mid+1;
                }

            }


        }
         return ans;

    }
}
