package InterviewQuestionsDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class TWOSUM {

    public static void main(String[] args) {

      int[]  nums = {2,7,11,15} ;
      int  target = 9 ;


        System.out.println(Arrays.toString( tSUm(nums,target)));



    }

    public static int[] tSUm(int[] gvn,int target){

        if(gvn.length<=0) {
            return new int[]{0};

        }

        int left=0 , right = gvn.length-1;


        while(left<right){

            if(gvn[left]+gvn[right]==target){
                return  new int[]{left,right};

            }else if(gvn[left]+gvn[right]<target){
                left++;
            }else{
                right--;
            }


        }


        return new int[]{};


    }
}
