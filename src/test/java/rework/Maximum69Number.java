package rework;

import java.util.Arrays;

public class Maximum69Number {

    public static void main(String[] args) {


        System.out.println(maximumNumber(9669));

    }

    private static int maximumNumber(int num){

        char[] chArr = Integer.toString(num).toCharArray();

        for (int i = 0; i < chArr.length-1; i++) {

            if(chArr[i]=='6') chArr[i]='9';
            break;

        }
        return Integer.parseInt(String.valueOf(chArr));

    }
}
