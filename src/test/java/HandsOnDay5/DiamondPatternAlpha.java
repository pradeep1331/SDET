package HandsOnDay5;

public class DiamondPatternAlpha {

    public static void main(String[] args) {


         printPattern(5);
    }

    public static void printPattern(int gvn){

        int Ascii = 64;


        //Upper triangle
        for (int i=0;i<=gvn;i++){
            //spaces
            for (int spc = gvn-i; spc>0;spc--){
                System.out.print(" ");
            }

            for (int j= 0;j<i;j++){
                if(j==0 || j == i-1) {
                    System.out.print((char) (Ascii + i) + " ");
                }else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }


        //lower triangle
        for (int i=gvn-1;i>0;i--){
            //spaces
            for (int spc = 0 ; spc<gvn-i;spc++){
                System.out.print(" ");
            }
            for(int j = i ;j>0;j-- ){
                if(j==1 || j == i) {
                    System.out.print((char) (Ascii + i) + " ");
                }else {
                    System.out.print(" "+ " ");

                }
            }
            if(i != 1) System.out.println();
        }


    }
}




