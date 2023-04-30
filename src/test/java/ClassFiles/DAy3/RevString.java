package ClassFiles.DAy3;

import java.util.Arrays;

public class RevString {
    public static void main(String[] args) {
         String gvn = "Welcome to Testleaf";
        revStr(gvn);
    }
    public static void revStr(String gvn){

        String[] arr = gvn.split(" ");
        String output = "";
        for (String s : arr) {
            output = output + revgvnStr1(s) + " ";
        }
        System.out.println(output.trim());
    }

    public static String revgvnStr1(String gvnString){

        StringBuilder sb = new StringBuilder(gvnString);
        int left = 0 ,right = gvnString.length()-1;
        while(left<right){
            char temp =  sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left ++;
            right--;
        }
        return sb.toString();
    }



}
