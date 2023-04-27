package HandsOnDay4;

public class SandglassStarPattern {

    public static void main(String[] args) {

        printPattern(5);

    }

    public static void printPattern(int gvn){



            //Upper triangle
              for (int i=gvn;i>0;i--){
                  //spaces
                  for (int spc = 0 ; spc<gvn-i;spc++){
                      System.out.print(" ");
                  }
                  for(int j = i ;j>0;j-- ){
                      System.out.print("* ");
                  }
                  if(i != 1) System.out.println();
              }

        //lower triangle
        for (int i=0;i<=gvn;i++){
            //spaces
            for (int spc = gvn-i; spc>0;spc--){
                System.out.print(" ");
            }
            for (int j= 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }

}
