package ClassFiles.Day4;

import java.util.Arrays;

public class SelectionSOrt {

    public static void main(String[] args) {
        int[] gvn1 = {11,4,17,18,2,22,1,8};

        sort(gvn1);

    }

    public static void sort(int[] gvn){

        int pivot = 0;
        int pos = 0;
        if(gvn == null || gvn.length==0){
            System.out.println("");
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
        System.out.println(Arrays.toString(gvn));
    }
}
