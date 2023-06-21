package TwoPointerrework;

public class MinimumNumberofFlips {

    public static void main(String[] args) {

        String s = "111000";

        flipCount("111000");
        flipCount("010");
        flipCount("1110");

    }

    public static void flipCount(String S){


         char[] gvnarr = S.toCharArray();
         char startValue;

         if(gvnarr[0]==0){
             startValue = '0';
         }else {
             startValue = '1';
         }

         int counter = 0;

        for (int i = 1; i < gvnarr.length; i+=2) {

            if(gvnarr[i]==startValue){
                counter++;
            }

        }

        System.out.println(counter);


    }

}
