package HandsOnDay27;

import java.util.HashMap;
import java.util.Map;

public class counterOccurance {

    public static void main(String[] args) {

        String  s = "TestLeaf";

    }

    private  static void occurance(String gvn){

        Map<Character,Integer> hmap = new HashMap<>();

        for (  char ch :   gvn.toCharArray()  ) {

            //  hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            if((hmap.containsKey(ch))){
                hmap.put(ch,1);
            }else{
                hmap.put(ch,hmap.get(ch)+1);
            }
        }

    }


}
