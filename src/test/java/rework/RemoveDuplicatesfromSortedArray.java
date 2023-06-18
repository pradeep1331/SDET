package rework;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int[] nums1 = {1,1,2};

        System.out.println(rmveDup(nums));
        System.out.println(rmveDup(nums1));

    }

    private static int rmveDup(int[] nums){

          int left = 0 , right =0;

          while(right< nums.length){

              if(nums[left] != nums[right]) {

                  int temp = nums[left];
                  nums[left] = nums[right];
                  nums[right] = temp;

                  left++;
                  right++;

              }
              right++;


          }

          return left+1;



    }
}
