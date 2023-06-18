package mandatoryHomeWork.week6.day2;

public class minCommonVal {

    public static void main(String[] args) {

      int []  nums1 = {1,2,3,6} , nums2 = {2,3,4,5};


        System.out.println(getCommon(nums1,nums2));

    }


    public static int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;

        int left = 0 ;
        int right = 0;

        while(left < nums1.length && right < nums2.length){

            if (nums1[left] == nums2[right]){

                min = Math.min(nums1[left], min);
                left++;
                right++;
            } else if (nums1[left] != nums2[right] && nums1[left] < nums2[right] ) {

                left++;

            }else {
                right++;
            }


        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }




    }
}
