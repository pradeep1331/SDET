package HandsOnDay25;

public class SwapCharOnly {
    public String reverseOnlyLetters(String s) {

        StringBuilder s1 = new StringBuilder(s);

        int left = 0 , right = s.length()-1;

        while(left<right){

            if((s1.charAt(left) > 33 && s1.charAt(left) <122) && (s1.charAt(right) >33 && s1.charAt(right) < 122)){
                char temp = s1.charAt(left);
                s1.setCharAt(left,s1.charAt(right));
                s1.setCharAt(right,temp);
            } else if (!(s1.charAt(left) > 33 && s1.charAt(left) <122) ) {
                left++;

            }else{
                right++;
            }
        }
        return s1.toString();
    }
}
