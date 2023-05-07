package ClassFiles.Day4;

import java.util.Arrays;

public class BubbleSOrt {
    public static void main(String[] args) {

        int[] gvn1 = {11,4,17,18,2,22,1,8};
        bBort(gvn1);
    }
    public static void bBort(int[] gvn1){


         int n = gvn1.length;

         // last one is set to Highest
         // start from beginning and swap till end

         for(int i = 0 ;i<n;i++){
             int swapped = 0 ;
             for(int j = 0;j<n-i-1;j++){
                 if(gvn1[j]>gvn1[j+1]){
                     int temp = gvn1[j];
                      gvn1[j] = gvn1[j+1];
                      gvn1[j+1] = temp;
                     ++swapped ;
                 }
             }
             if (swapped==0) break;

         }


        System.out.println(Arrays.toString(gvn1));
    }
}
