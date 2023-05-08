package ClassFiles.Day5;

public class slidingwindow2 {

    public static void main(String[] args) {

        int[]  arr = {1, 1, 44, 1, 1, 1};

        window(arr,3);


    }

    public static void window(int[] arr, int sum) {
        int left = 0, right = 0, currentSum = 0;
        while ( right<arr.length) {
            if (sum == currentSum) {
                for (int i = left; i <= right-1; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                currentSum = currentSum - arr[left];
                left++;
            } else if (currentSum < sum) {
                currentSum += arr[right];
                right++;
            } else {
                currentSum -= arr[left];
                left++;
            }
        }
    }
}
