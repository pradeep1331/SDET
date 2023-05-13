package HandsOnDay15;

import javax.xml.bind.annotation.XmlAnyAttribute;

public interface SmallestLetterGreater {

    public static void main(String[] args) {

        char[] arr1= {'c','f','j'}; char tar1= 'a';

        char[] arr2 = {'c','f','j'}; char tar2 = 'c';
        char[] arr3 ={'x','x','y','y'} ; char tar3 = 'z';

        System.out.println(smallGrtTar(arr1,tar1));
        System.out.println(smallGrtTar(arr2,tar2));
        System.out.println(smallGrtTar(arr2,tar2));
    }

    public static char smallGrtTar(char[] arr1,char target){

        char val ;

        int asciitar = (int)(target);
        int minAscii = Integer.MAX_VALUE;

        for ( char i  :  arr1) {

            minAscii = Math.min(minAscii,((int)i));
           // System.out.println(minAscii);
            if((int)i > asciitar) return i;
            //System.out.println((int)i);
        }
        return (char)(minAscii);
    }
}
