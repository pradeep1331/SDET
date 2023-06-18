package rework;

public class CountofMatchesinTournament {

    public static void main(String[] args) {

    
        System.out.println(numofmatches(7));

    }

    private static int numofmatches(int n){

        int sum = 0 ;

        while (n>1){

        if(n%2==0){
            sum = sum + (n/2);
            n= n/2;
        }else{

          sum = sum + (n-1)/2;
          n = ((n-1)/2)+1;
        }
        }


     return sum;

    }
}
