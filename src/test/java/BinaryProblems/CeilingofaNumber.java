package BinaryProblems;

public class CeilingofaNumber {

    public static void main(String[] args) {

         int[] arr = {1,2,2,3,5};
        System.out.println(ceilling(arr,5));
    }




     static int ceilling(int[] arr, int target) {
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if(target == arr[mid]){
                // ans found
                System.out.println(arr[mid]);
                return mid;
            }
        }
         System.out.println(arr[start]);
        return start;
    }
}
