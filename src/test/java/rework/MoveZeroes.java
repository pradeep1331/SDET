package rework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        System.out.println(Arrays.toString(moveZeroes(nums)) );

    }

    private static int[] moveZeroes(int[] gvnArr){

        if(gvnArr.length==1) return gvnArr;

        int left =0 , right =1;

        while(right<gvnArr.length){

            if(gvnArr[left]==0 && gvnArr[right]>0){
                int temp = gvnArr[left];
                gvnArr[left] = gvnArr[right];
                gvnArr[right] = temp;
                left++;
                right++;
            } else if ((gvnArr[right] ==0)) {
                right++;
            }
        }
        return  gvnArr;
        }

}
