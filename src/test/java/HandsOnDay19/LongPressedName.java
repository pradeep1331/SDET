package HandsOnDay19;

import java.util.Calendar;
import java.util.Stack;

public class LongPressedName {

    public static void main(String[] args) {

        String name = "alex", typed = "aaleex";

        System.out.println(LongPressedName(name,typed));

    }

    public static boolean LongPressedName(String name, String typed ){

           int n = name.length(); int m = typed.length();

             int i = 0 , j =0;

             if(name.equals(typed)){
                 return true;
             }
        if (n > m) {
            return false;
        }
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j != 0 && typed.charAt(j) == name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }




        return i== name.length() ;
    }

}
