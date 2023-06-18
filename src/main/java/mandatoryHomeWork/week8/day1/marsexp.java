package mandatoryHomeWork.week8.day1;

public class marsexp {

    public static void main(String[] args) {

        System.out.println(marsExploration("SOSSPSSQSSOR"));

    }


     public static  int marsExploration(String s) {
        int Count=0;

        for (int i=0; i < s.length() ; i++)
        {
            if((i%3 == 0 || i%3 == 2) && (s.charAt(i)!= 'S'))
            {
                Count++;
            }
            if( i % 3 == 1 && (s.charAt(i) != 'O'))
            {
                Count++;
            }
        }
        return Count;
    }
    }

