package HandsOnDay11;

import java.io.CharArrayReader;
import java.util.HashMap;

public class SlidingWinNonRepeat {
    public static void main(String[] args) {

        String gvn = "xyzzaz";
        String gvn1 = "";

        nrpt(gvn,3);
        nrpt(gvn1,3);

    }

    public static void nrpt(String gvn, int k) {
                                // inpotu = aababcabc           // k =3
        if(gvn.length()<k || gvn == null ){
            System.out.println("Provide valid input");
        }else {


            StringBuilder gvnstr = new StringBuilder(gvn);
            StringBuilder str = new StringBuilder(gvnstr.substring(0, k));
            int counter = 0;
            //str = aab


            counter = chkunique(str, counter);
            for (int i = k; i < gvnstr.length(); i++) {
                // 0 3
                str.append(gvnstr.charAt(i));
                str.replace(0, 1, "");

                // sum + arr[k]
                // sum - arr[i-k]
                counter = chkunique(str, counter);
                 System.out.println(str);
            }
            System.out.println(counter);
        }

    }

    public static int chkunique(StringBuilder gvnstring,int count){

        HashMap<Character,Integer> cmap = new HashMap<>();
        for (int i = 0; i < gvnstring.length(); i++) {
            cmap.put(gvnstring.charAt(i),cmap.getOrDefault(gvnstring.charAt(i),0)+1);
        }
        boolean flag = true;
        for ( char c  : cmap.keySet()  ) {
            if(cmap.get(c)>1){
                flag = false;
                break;
            }
        }
        if(flag) count++;
        return count;
            }
}
