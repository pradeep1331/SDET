package ClassFiles.DAy3;

public class StringManipulation {

    public static void main(String[] args) {
        insbrks("1.1.1.1");
        insbrks2("1.1.1.1");
    }
    public static void insbrks(String gvn) {
        String output = "";
        for (char c : gvn.toCharArray()) {
            if (c == '.') output = output + "[.]";
            else output = output + c;
        }
        System.out.println(output);
    }


     public static void insbrks2(String gvn){

         String[] arr = gvn.split("[\\.]");
         String convertedString = String.join("[.]", arr);

         System.out.println(convertedString);

     }

     private static void rmvvowels(String gvn){


     }


}
