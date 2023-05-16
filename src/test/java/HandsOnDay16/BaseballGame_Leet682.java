package HandsOnDay16;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Stack;

public class BaseballGame_Leet682 {

    public static void main(String[] args) {

        String[] ops = {"5","2","C","D","+"};
        System.out.println(baseBall(ops));

    }

    public static int baseBall(String[] gvn){

        Stack<Integer> stack = new Stack<>();

        for ( String i  : gvn  ) {
            boolean flag = false;
          try{ Integer.parseInt(i);
              flag = true;
          }catch (Exception ignored){
          }
            if(flag){
                stack.push(Integer.parseInt(i));
            } else if (i.equals("C")) {
                stack.pop();
            } else if (i.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(c);

            }else if(i.equals("D")) {
                stack.push(stack.peek()*2);
            }
        }
         int val = 0;
        while (!stack.isEmpty()){
            val += stack.pop();
        }
        return val;
    }

}
