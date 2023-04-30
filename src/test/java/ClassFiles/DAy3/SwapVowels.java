package ClassFiles.DAy3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapVowels {

    public static void main(String[] args) {

      String gvn = "Hello Everyone! Welcome to Testleaf";
        swapvowels(gvn);
    }

    private static void swapvowels(String gvn){

         String[] arr = gvn.split("");
         int left = 0 ,  right = arr.length-1;
        while (left < right) {
            if (isVowel(arr[left]) && isVowel(arr[right])) {
                String temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            }
        }
        System.out.println(String.join("", arr));
    }
    private static boolean isVowel(String c){
        switch(c) {
            case "a" : return true;
            case "e" : return true;
            case "i" : return true;
            case "o" : return true;
            case "u" : return true;
            case "A" : return true;
            case "E" : return true;
            case "I" : return true;
            case "O" : return true;
            case "U" : return true;
            default:return false;

        }


    }


}
