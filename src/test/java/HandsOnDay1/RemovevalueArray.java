package HandsOnDay1;

import java.util.Arrays;

public class RemovevalueArray {
    public static void main(String[] args) {
                  int[] gvn = {1,2,3,4,5,5};

       removeVal(gvn,5);

        removeVal(gvn,6);

    }

    public static void removeVal(int[] arr,int value){

         int count = 0;

        for (int a:arr) {
            if(a == value) count++;
        }


        int[] newArr = new int[arr.length-count];
        int newArrCount = 0;
        for (int j=0;j<arr.length;j++ ) {
            if(arr[j]!=value){
                newArr[newArrCount] = arr[j];
                newArrCount++;

            }

        }
        System.out.println(Arrays.toString(newArr));



    }

}
