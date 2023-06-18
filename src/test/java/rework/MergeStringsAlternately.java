package rework;

public class MergeStringsAlternately {
    public static void main(String[] args) {

        String word1 = "abc", word2 = "pq";

        System.out.println(merge(word1,word2));

    }

    private static String merge(String word1, String word2){

        int n1 = word1.length(); int n2 = word2.length();


         StringBuilder s1 = new StringBuilder();

        int n = Math.min(n1, n2);

             for (int i = 0; i <n ; i++) {
                 s1.append(word1.charAt(i));
                 s1.append(word2.charAt(i));
             }
             if(n1>n) s1.append(word1.substring(n,n1));
             else s1.append(word1.substring(n,n2));
             return s1.toString();
    }
}
