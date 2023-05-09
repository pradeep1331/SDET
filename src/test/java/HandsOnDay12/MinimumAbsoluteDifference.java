package HandsOnDay12;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {

        int[] arr1 = {4,2,1,3};
        int[] arr2 = {1,3,6,10,15};
        int[] arr3 = {3,8,-10,23,19,-4,-14,27};
        minAbsDiff(arr1);
        System.out.println("------------<>--------------");
        minAbsDiff(arr2);
        System.out.println("------------<>--------------");
        minAbsDiff(arr3);

    }

    public static void minAbsDiff(int [] arr){

        sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i-1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
         int left = 0, right =1;
        while(right< arr.length){
             int diff = Math.abs(arr[left]-arr[right]);
              if(diff == minDiff){
                  System.out.println(arr[left]+" "+arr[right]);
              }
              left++;
              right++;
        }
    }


    public static void sort(int[] gvn){

        int pivot = 0;
        int pos = 0;
        if(gvn == null || gvn.length==0){
            System.out.println(" ");
        }
        while(pivot< gvn.length-1){
            int min = Integer.MAX_VALUE;
            for(int i=pivot;i<gvn.length;i++){
                if(gvn[i] < min) {
                    min = gvn[i];
                    pos = i;
                }
            }
            int temp = gvn[pos];
            gvn[pos] = gvn[pivot];
            gvn[pivot] = temp;
            pivot++;
        }
      //  System.out.println(Arrays.toString(gvn));
    }
}
