package HandsOnDay13;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] gvn1 = {1,3,5,6};

        System.out.println(searchInsert(gvn1,2));

    }

    public static int searchInsert(int[] nums,int target){


        int left = 0;
        int right = nums.length-1;

        while(left<=right){

            int mid = (left+right)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){

                right = mid-1;
            }else{
                left = mid+1;

            }
        }
        return left;
    }
}
