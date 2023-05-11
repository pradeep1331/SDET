package HandsOnDay13;

public class HighestLowestDIff {

    public static void main(String[] args) {
        int[] gvn = {9,4,1,7};

        System.out.println(maxmin(gvn,2));

    }

    public static int maxmin(int[] arr,int k){

        if(arr.length ==0){
            return 0;
        }

         int min = Integer.MAX_VALUE;

        for (int i =0;i<=arr.length-1;i++){

            for (int j = i+1; j< arr.length; j++) {

                int diff = Math.abs(arr[i]-arr[j]);

                 min = Math.min(diff,min);

            }

        }

     return min;

    }

}
