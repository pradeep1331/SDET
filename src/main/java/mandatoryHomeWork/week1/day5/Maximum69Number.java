package mandatoryHomeWork.week1.day5;

public class Maximum69Number {

    public static void main(String[] args) {

        System.out.println(maxNum(9669));
        System.out.println(maxNum(9996));
        System.out.println(maxNum(9999));


        // Since in


    }

    public static int maxNum(int n){

         char[] cArr = Integer.toString(n).toCharArray();


        for(int i=0;i<cArr.length;i++){

            if(cArr[i]=='6') {
                cArr[i] = '9';
                break;
            }
        }

        String newStr = new String(cArr);

        return Integer.parseInt(newStr);




    }
}
