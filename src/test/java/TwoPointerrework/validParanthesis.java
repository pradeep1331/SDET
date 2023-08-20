package TwoPointerrework;
public class validParanthesis {


    public static void main(String[] args) {

        String s = "(]{}()";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
         boolean flag = false;
        for (int i = 0; i < s.length(); i+=2) {
            if(s.charAt(i)=='{'){
                if(s.charAt(i+1)=='}') flag = true;
                else return false;
                }

        if(s.charAt(i)=='('){
            if(s.charAt(i+1)==')') flag = true;
            else return false;
        }
            if(s.charAt(i)=='['){
                if(s.charAt(i+1)==']') flag = true;
                else return false;
            }
        }
         return true;
        }
    }

