package mandatoryHomeWork.week5.day5;

public class balancedStringSplit {

    public static void main(String[] args) {

        String s = "RLRRLLRLRL";

        System.out.println(balancedStringSplit(s));

    }

    public static int balancedStringSplit(String s) {

        int r, l,count;
        r=l=count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else l++;

            if(r==l) {
                count++;
                r=l=0;
            }
        }
        return count;
    }
}
