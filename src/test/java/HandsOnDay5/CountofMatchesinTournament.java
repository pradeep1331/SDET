package HandsOnDay5;

public class CountofMatchesinTournament {

    public static void main(String[] args) {



        numOfMatches(14);
        numOfMatches(7);
        numOfMatches(1);


    }

     public static void numOfMatches(int n){

         int matches = 0;

           while(n != 1){
               if(n%2==0){
                   matches = matches +  n/2;
                   n = n/2;
               }else{
                   matches = matches + ((n - 1) / 2);
                   n = ((n - 1) / 2) + 1;
               }

           }
         System.out.println(matches);

     }






}
