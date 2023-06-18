package mandatoryHomeWork.week2.day4;

public class ReversePrefixofWord {

    public static void main(String[] args) {

        String gvn1 = "abcdefd";
        String gvn2 = "abcd";

        System.out.println(revString(gvn1,'d'));
        System.out.println(revString(gvn2,'z'));
    }

    public static String revString (String gvn,char c){

        StringBuilder s1 = new StringBuilder(gvn);
        int n = gvn.indexOf(c);
        if (n<0) return gvn;
        int left = 0,right=n;
        while(left < right){
             char temp = s1.charAt(left);
             s1.setCharAt(left,s1.charAt(right));
            s1.setCharAt(right,temp);
            left++;
            right--;

        }
        return s1.toString();
    }
}
