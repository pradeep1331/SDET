package InterviewQuestionsDSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] gvn = {0,0,1,1,1,2,2,3,3,4};


        System.out.println(removeDup(gvn));
    }

    private static int removeDup(int[] gvn) {
        int left = 0, right = 1;
        while (right < gvn.length) {
            if(gvn[left] != gvn[right]){
                left++;
                gvn[left] = gvn[right];
            }
                right++;
        }
        System.out.println(Arrays.toString(gvn));

        return left+1;
    }
}
