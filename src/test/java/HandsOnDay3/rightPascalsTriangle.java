package HandsOnDay3;

public class rightPascalsTriangle {

    public static void main(String[] args) {

        pattern(5);
    }

    public static void pattern( int num){

         // Upper Pattern // row
          for(int i = 0 ; i<=num;i++ ){
              //col
              for(int j = 0 ; j < i;j++ ){
                  System.out.print("* ");
              }
              System.out.println();
          }
          // Lower pattern

            for (int i = num-1;i>0;i--){

                for(int j = i;j>0;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

