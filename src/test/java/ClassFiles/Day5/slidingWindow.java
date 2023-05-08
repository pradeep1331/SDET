package ClassFiles.Day5;

public class slidingWindow {

    public static void main(String[] args) {

        int[] arr = {1,-5,2,3,7,1};

        System.out.println(max(arr,3));

    }

    public static int max(int[] nums,int k){
        int sum = 0 , maxSum=0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        maxSum = sum;
        for (int i = k; i < nums.length; i++) {
          sum = sum -nums[i-k] + nums[i];
          maxSum = Math.max(sum,maxSum);
        }
        return maxSum;


    }
}
