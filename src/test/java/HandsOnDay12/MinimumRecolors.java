package HandsOnDay12;

import javax.swing.plaf.IconUIResource;

public class MinimumRecolors {

    public static void main(String[] args) {

        System.out.println(minBlock("WBBWWBBWBW",7));
        System.out.println(minBlock("WBWBBBW",2));

    }

    public static int minBlock(String str, int k){
        int min = Integer.MAX_VALUE;
        int l = str.length();
        for (int i=0;i<l-k;i++){
             int counter = 0;
            for (int j = i; j < i+k; j++) {
                   if(str.charAt(j)=='W')
                       counter++;
             //   System.out.println(counter+" i");
            }
            min = Math.min(min,counter);
        }
      return min;
    }
}
