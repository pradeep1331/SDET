package HandsOnDay16;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {

        String s = "ab#c", t = "ad#c";

        System.out.println(BackspaceStringCompare(s,t));

    }
    public static boolean BackspaceStringCompare(String gvn1, String gvn2) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (char c : gvn1.toCharArray()) {
            if (c == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(c);
            }
        }
        for (char c : gvn2.toCharArray()) {
            if (c == '#') {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            } else {
                s2.push(c);
            }
        }
        return s1.toString().equals(s2.toString());
    }
}