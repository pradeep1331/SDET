package rework;

public class MaxprdtwoEle {

    public static void main(String[] args) {

        int[] nums1 = {3,4,5,2};
        int[] nums2 = {5,1,1,5};

        MaxprdtwoEle nm = new MaxprdtwoEle();
        nm.maxTwoNum(nums1);
        nm.maxTwoNum(nums2);


    }

    private void maxTwoNum(int[] nums){

        int left = 0 , right = nums.length-1;
        int firstMax = nums[left];
        int SecondMax = nums[nums.length-1];
        if(nums.length<=1){
            System.out.println(-1);
        }
        while (left<right){
            firstMax=    Math.max(firstMax,nums[left]);
            SecondMax =  Math.max(SecondMax,nums[right]);
            left++;
            right--;
        }
        System.out.println((firstMax-1)*(SecondMax-1));
    }
}
