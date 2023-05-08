package HandsOnDay11;

public class revInt {
    public static void main(String[] args) {

        int gvn = 1332;
        int gvn1 = 4;
        System.out.println(reverseInteger(gvn));
        System.out.println(reverseInteger(gvn1));

    }

    public static int reverseInteger(int num) {

        String str = Integer.toString(num);

        int left = 0;
        int right = str.length() - 1;

        char[] charArray = str.toCharArray();

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        int reversedNum = Integer.parseInt(new String(charArray));

        return reversedNum;
    }
}
