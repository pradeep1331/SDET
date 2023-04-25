package HandsOnDay2;

import java.util.ArrayList;
import java.util.Arrays;

public class removeFirstLastOccurance {

    public static void main(String[] args) {

         int[] gvn = {1,2,3,4,5,1};

        int[] gvn1 = {1,2,3,4,5};

        removeOccurance(gvn,1);
        removeOccurance(gvn1,2);


    }

    public static void removeOccurance(int[] arr,int value){

        int occurance = 0;
        int firstOccurance = -1;
        int lastOccurance =-1;

        for ( int j : arr ) {
            if(j==value) occurance++;
        }
        System.out.println(occurance);
         for(int i=0;i<arr.length;i++){
             if(arr[i]==value){
                 if(firstOccurance==-1){
                     firstOccurance = i;
                 }
                 lastOccurance=i;
             }
         }
        System.out.println(firstOccurance);
        System.out.println(lastOccurance);
        ArrayList<Integer> newArr = new ArrayList<Integer>();


         for(int j =0 ; j< arr.length;j++){
             if( !(j == firstOccurance) ){
                 if(!(j == lastOccurance)) {
                     newArr.add(arr[j]);
                 }
             }
          }
        System.out.println(newArr.toString());
    }


}
