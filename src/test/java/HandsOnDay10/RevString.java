package HandsOnDay10;

public class RevString {
    public static void main(String[] args) {
         String gvn = "Let's take LeetCode contest";
        revStr(gvn);
    }
    public static void revStr(String gvn){
        String[] arr = gvn.split(" ");
        StringBuilder output = new StringBuilder();
        for (String s : arr) {
            output.append(revgvnStr1(s)).append(" ");
        }
        System.out.println(output.toString().trim());
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
