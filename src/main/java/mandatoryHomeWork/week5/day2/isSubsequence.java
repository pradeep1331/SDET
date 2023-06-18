package mandatoryHomeWork.week5.day2;

public class isSubsequence {
    public static void main(String[] args) {

        isSubsequence("abc","ahbgdc");

    }

    public static boolean isSubsequence(String s, String t) {

        if(s.length()>t.length())
            return false;
        if(s.length()==0)
            return true;

        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        int j=0;
        for (int i=0;i<=tt.length-1;i++)
            if (ss[j] == tt[i]) {
                j++;
                if (j == ss.length)
                    return true;
            }
        return false;

    }
}
