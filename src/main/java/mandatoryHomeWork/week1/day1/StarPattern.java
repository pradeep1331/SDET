package mandatoryHomeWork.week1.day1;

public class StarPattern {
       //Pseudo
       // 1. Pattern has row and column
       // 2. Initialize row and column variables
       // 3. for loop for each row - have to print column values based on row value
      // 4. spaces have to included before each * so that pyramid shape is obtained eg. first one 5, next 4 have to initialize for loop to print them
      //  5. Checking spaces values seems  row -1

    public static void main(String[] args) {
//        1. Pyramid Program
//    *
//   * *
//  * * *
// * * * *
//* * * * *
        printPattern(5);
        printPattern(0);
        printPattern(-1);
    }

    public static void printPattern (int num){
        //row
        for (int i=0;i<num;i++){
            // to print spaces
            for (int spc = 0;spc<num-i;spc++){
                System.out.print(" ");
            }
            //col
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
