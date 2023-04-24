package Day1;

public class sqrRt {

    public static void main(String[] args) {

        //"Given a number x, find the square root of the number nearest to 3 decimal places.
        //Do not use sqrt function.
        //1 > x > 10,000"
        squareRT(5000);

        System.out.println(Math.sqrt(10));
    }

    public static void squareRT(int gvn){

        int squareRoot;
         for(int i=1; i<gvn;i++){
                 if(i*i==gvn){
                     System.out.println(i);
                 }

         }


    }
}
