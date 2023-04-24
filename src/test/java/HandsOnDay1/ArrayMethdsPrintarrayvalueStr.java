package HandsOnDay1;

import java.util.Arrays;

public class ArrayMethdsPrintarrayvalueStr {

    //Pseudo
    //1. get the array
    //2. Loop through the array and add to a initialized string variable
    //3. Check if the gvn array is empty and throw null for edge case
    public static void main(String[] args) {

         int[] gvn = {1,2,3,4,5};
        int[] gvn1 = {};

        System.out.println(convertString(gvn));
        System.out.println(convertString(gvn1));


    }

    public static String convertString(int[] arr) {

        String str = "";
         if (arr.length == 0){
             return null;
         }else {
             for (int j : arr) {
                 str += j;
             }
             return str;
         }
    }
}
