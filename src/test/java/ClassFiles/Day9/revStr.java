package ClassFiles.Day9;

public class revStr {
    public static void main(String[] args) {

        String gnv1 = "Hello";
        String gnv2 = "H#&yq";
        String gnv3 = "H";
        String gnv4 = "";

        System.out.println(revString(gnv1));
        System.out.println(revString(gnv2));
        System.out.println(revString(gnv3));
        System.out.println(revString(gnv4));

    }

    public static String revString(String str){

        StringBuilder s1 = new StringBuilder(str);

        int left = 0 ;
        int right = str.length()-1;

         while(left < right){

             char temp = s1.charAt(left);
             s1.setCharAt(left, s1.charAt(right));
             s1.setCharAt(right,temp);
             left++;
             right--;
         }
         return s1.toString();
    }
}
