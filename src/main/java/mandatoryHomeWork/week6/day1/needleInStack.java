package mandatoryHomeWork.week6.day1;

public class needleInStack {

    public static void main(String[] args) {

        String haystack = "leetcode", needle = "leeto";

        System.out.println(strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
        int n=needle.length();
        int hayLength=haystack.length();
        for(int i=0;i<hayLength-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
