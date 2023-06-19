package TwoPointerrework;

import java.lang.reflect.AnnotatedType;
import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {

      int []  nums = {2,7,11,15}; int target = 9;


        TwoPointer tpointer = new TwoPointer();

       int[] a = tpointer.TSum(nums,target);

        System.out.println(Arrays.toString(a));
    }

    public int[] TSum(int[] gvn,int target){

         int left = 0 , right = gvn.length-1;

         while (left<right){

             if(gvn[left]+gvn[right]==target){
                 return new int[]{left,right};
             }else if(gvn[left]+gvn[right]<target) {
                 left++;
             }else {
                 right--;
             }


         }


        return new int[]{0};
    }
}
