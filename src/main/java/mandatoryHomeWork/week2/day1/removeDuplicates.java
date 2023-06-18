package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {

         int[] gvn = {1,1,2};
         int[] gvn1= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeduplicates(gvn));
        System.out.println(removeduplicates(gvn1));
    }
    public static int removeduplicates(int[] arr){
         int left = 0 , right = 1;
         if(arr.length == 0 || arr == null){
             return 1;
         }
          while(right < arr.length){
              if(arr[left]!=arr[right]){
                  left++;
                  arr[left] = arr[right];
              }else{
                  right++;
              }
          }
        System.out.println(Arrays.toString(arr));
            return left+1;
    }
}
