package BinaryProblems;

public class floor {

    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,11,12,13};

        System.out.println(floor(arr,10));
    }

    public static int floor(int[] nums,int target){

        int start = 0 , end = nums.length-1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid -1;
            }else if(target>nums[mid]){

                start = mid +1;
            }else{
                return mid;
            }
            }


        return end;
    }
}
