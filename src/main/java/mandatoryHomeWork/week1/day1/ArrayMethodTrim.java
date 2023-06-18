package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class ArrayMethodTrim {

    public static void main(String[] args) {

        int[] gvn = {1,2,3,3,4,5,5};

        System.out.println(Arrays.toString(trim(gvn,3)));



    }

     public static int[] trim(int[] arr,int size){

         int[] trimArr = new int[size];

          for (int i=0;i<trimArr.length;i++){

               trimArr[i] = arr[i];
          }

           return trimArr;
     }
}
