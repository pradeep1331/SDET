package mandatoryHomeWork.week3.day4;

public class KBeautyNumber {

    public static void main(String[] args) {

       // kb(240,2);
        kb(430043,3);

    }
    public static void kb(int num, int k) {
        String s1 = Integer.toString(num);
        StringBuilder s2 = new StringBuilder();
        int count =0;
        for (int i = 0; i <= s1.length()-k+1; i++) {
            s2.append(s1.charAt(i));
            System.out.println(s2);
            if (s2.length() > k) {
                s2.deleteCharAt(0);
            }
           System.out.println(s2);
           // System.out.println(s2);

            if(s2.length()>=k && s2.charAt(0)!= '0'){

                if((num%(Integer.parseInt(s2.toString()))==0)){
                    count++;

                };
            }
        }
        System.out.println(count);
    }
}
