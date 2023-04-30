package ClassFiles.DAy3;

public class SwapVowels2 {

    public static void main(String[] args) throws Exception {

        String gvn1 = "";
      String gvn = "Hello Everyone! Welcome to Testleaf";
        swapVowels(gvn1);
        swapVowels(gvn);
    }

    private static void swapVowels(String str) throws Exception {
        StringBuilder sb = new StringBuilder(str);
        int left = 0, right = sb.length() - 1;

        if(sb.length() >0) {
            while (left < right) {
                if (isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))) {
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                } else if (!isVowel(sb.charAt(left))) {
                    left++;
                } else if (!isVowel(sb.charAt(right))) {
                    right--;
                }
            }
            System.out.println(sb);
        }else {
            System.out.println("Length is Zero");
        }
    }
    private static boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        switch(ch) {
            case 'a' : return true;
            case 'e' : return true;
            case 'i' : return true;
            case 'o' : return true;
            case 'u' : return true;
            default:return false;

        }


    }


}
