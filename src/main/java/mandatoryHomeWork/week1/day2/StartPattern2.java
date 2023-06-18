package mandatoryHomeWork.week1.day2;

public class StartPattern2 {

    public static void main(String[] args) {

        starPtrn(6);
    }

    public static void starPtrn(int num){

        // Upper Pattern
            // row
             for(int row =1;row<=num;row++) {
                 //spaces
                     for (int spc = 0; spc < num - row; spc++) {
                         System.out.print(" ");
                     }
                     //col
                     for (int col = 1; col <= row; col++) {
                         System.out.print("* ");
                     }
                     System.out.println();
                 }

             // Lower pattern
                 for(int row = num-1;row>0;row--){
                     //spaces
                     for(int spc = 1;spc<num-row+1;spc++){
                         System.out.print(" ");
                     }
                     for (int col=row;col>0;col--){
                         System.out.print("* ");
                     }
                     System.out.println();
                 }
             }

        }


