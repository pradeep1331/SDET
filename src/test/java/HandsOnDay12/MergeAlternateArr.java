package HandsOnDay12;

public class MergeAlternateArr {
    public static void main(String[] args) {

        String word1 = "abcpq", word2 = "pq";
        System.out.println(mergeAlt(word1,word2));
    }

    public static String mergeAlt(String s1,String s2){

        StringBuilder sb1 = new StringBuilder("");

        int stplen = 0 ;

        if(s1.length()>s2.length()) stplen = s2.length();
        else if(s2.length()>s1.length()) stplen = s1.length();

         int left = 0 ;

         while(left<stplen){

             sb1.append(s1.charAt(left));
             sb1.append(s2.charAt(left));
             left++;
         }

         if(s1.length()>stplen) sb1.append(s1.substring(stplen));
         else sb1.append(s2.substring(stplen));


        return sb1.toString();
    }
}
