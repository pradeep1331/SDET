package HandsOnDay18;

import java.util.Stack;

public class MakeTheStringGreat {

    public static void main(String[] args) {
        MakeStrGRT("abBAcC");
    }

    public static void MakeStrGRT(String s){

        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
             if(s1.size()!=0 && s1.peek() - s.charAt(i)==32){
                 s1.pop();
             }else {
                 s1.push(s.charAt(i));
             }
        }

        String s2 = "";
        for( Character chr : s1){
            s2 =  chr + s2;
        }
    }
}
