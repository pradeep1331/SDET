package HandsOnDay8;

import java.util.Arrays;

public class DIString {

    public static void main(String[] args) {

        String str = "IDID";
        String str1 = "III";
        String str2 = "DDI";



        System.out.println(Arrays.toString(diStr(str)));
        System.out.println(Arrays.toString(diStr(str1)));
        System.out.println(Arrays.toString(diStr(str2)));

    }

    public static int[] diStr(String s){

        int size = s.length();

        int[] newArr = new int[size+1];

         int iCounter = 0;
         int DCounter = size;

            for(int i=0;i<size;i++){

                if(s.charAt(i)=='I'){

                    newArr[i] = iCounter++;
                }else{
                    newArr[i] = DCounter--;

                }


            }

          newArr[newArr.length-1] = DCounter;

            return newArr;
    }

}
