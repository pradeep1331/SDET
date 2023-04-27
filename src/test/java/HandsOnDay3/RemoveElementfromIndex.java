package HandsOnDay3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementfromIndex {
    public static void main(String[] args) {

        int[] gvn = {1,2,3,3,4,5,6};
        int[] gvn1 = {1};
        returnArr(gvn,2);
        returnArr(gvn,3);
        returnArr(gvn,0);
        returnArr(gvn1,0);
    }

    public  static void returnArr(int[] arr,int index){

         int occurance = 0;
         int value = arr[index];
        for ( int i  : arr ) {
            if(i == value) occurance++;
        }
         if(occurance >0) {
            // System.out.println(occurance);
             int[] newArr = new int[arr.length - occurance];
             int newIndex = 0;
             for (int j : arr) {
                 if (!(j == value)) {
                     newArr[newIndex] = j;
                     newIndex++;
                 }
             }
             System.out.println(Arrays.toString(newArr));
         }else {
             System.out.println("There is no occurance of value");
         }

    }
}
