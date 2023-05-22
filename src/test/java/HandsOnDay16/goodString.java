package HandsOnDay16;

import java.util.HashMap;

public class goodString {

    public static void main(String[] args) {

        String gnv = "xyzzaz";

        gdStr(gnv,3);

    }

    public static int gdStr(String gvn,int k ){


         StringBuilder s1 = new StringBuilder();
         int count = 0 ;

        for (int i = 0; i < gvn.length()-k; i++) {
            s1.append(gvn.charAt(i));

        }

        for (int i = 0; i < gvn.length()-k; i++) {
            s1.deleteCharAt(0);
            s1.append(gvn.charAt(i));

        }
        return -1;
    }

    public static int chkdistinct(String pattern,int count){

        HashMap<Character,Integer> hmap = new HashMap<>();

        for (int i = 0; i <pattern.length() ; i++) {

             hmap.put(pattern.charAt(i), hmap.getOrDefault(pattern.charAt(i),0)+1);

        }

        boolean flag = true;
        for ( Integer i: hmap.values() ) {
            if(i>1)flag = false;
        }
        if(flag) count++;
        return count;

    }
}
