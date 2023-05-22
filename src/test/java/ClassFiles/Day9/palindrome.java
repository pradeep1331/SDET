package ClassFiles.Day9;

public class palindrome {
    public static void main(String[] args) {

        String gvn1 = "abccba";
        String gvn2 = "racecar";
        System.out.println(isPalindrome(gvn1));
        System.out.println(isPalindrome(gvn2));



    }

    public static boolean isPalindrome(String str) {

        boolean flag = true;
        int left = str.length() / 2 - 1;
        int right;

        if(str.length()%2==0) {
            right = ((str.length()) / 2);
        }else{
           right = (str.length() / 2) + 1;
        }

        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
                break;
            }
            left--;
            right++;
        }

        return flag;
    }
}
