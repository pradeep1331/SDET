package HandsOnDay17;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args) {

      String  s = "ab#c", t = "ad#c";

        System.out.println(backspaced(s,t));

    }

    public static String backspaced(String str, String t) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }
}
