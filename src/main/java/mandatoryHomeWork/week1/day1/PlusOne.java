package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class PlusOne {

//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].

       //Pseudo
       // 1. Given can be any  number so have to take the number and convert to integer
       // 2. But cannot directly convert int array to int
       // 3. can use to string method and remove other chars
      //  4. convert to int with parse int and plus 1
     //   5. return int to array and print
     //  edge cases maybe  o values , 1 value , negative number with - in first number

    public static void main(String[] args) {

        int gvn[] = {1,2,3,4,5};
        int gvn1[] = {0};
        int gvn2[] = {};
        int gvn3[] = {-1,2,3,4};

        System.out.println(plsOne(gvn));
        System.out.println(plsOne(gvn1));
        System.out.println(plsOne(gvn2));
        System.out.println(plsOne(gvn3));

    }

    public static char[] plsOne(int[] arr) {
        char[] chrarr = new char[0];
        if (arr.length == 0) {
            System.out.println("Empty Array");
        } else {
            int gvn = Integer.parseInt(Arrays.toString(arr).replaceAll("[\\[\\]\\,\\ ]", ""));
            chrarr = Integer.toString((gvn + 1)).toCharArray();
        }
        return chrarr;
    }

}
