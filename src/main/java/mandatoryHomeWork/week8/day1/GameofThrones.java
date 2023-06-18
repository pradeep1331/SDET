package mandatoryHomeWork.week8.day1;

import java.util.HashMap;
import java.util.Map;

public class GameofThrones {

    public static void main(String[] args) {

        String s1 = "cdcdcdcdeeeef";

        System.out.println(gamThrone(s1));




    }

    private static String gamThrone(String gvn){

        //abcba


        Map<Character,Integer> hmap = new HashMap<>();

          for ( char ch  :  gvn.toCharArray() ) {
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        int oddCounter = 0;
                 //  a = 2 , b=2 , c =1
        for ( Integer val  :  hmap.values() ) {

            if(val %2 !=0){
                oddCounter++;
            }
        }

        if(oddCounter>1){
            return "NO";
        }
        return "YES";
    }
}
