package HandsOnDay11;

public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int[] gvn = {1,12,-5,-6,50,3};
        System.out.println(avgsub(gvn,4));
    }

    public static float avgsub(int[] gvn, int k){
         int sum = 0 ;
        for (int i = 0; i < k; i++) {
            sum += gvn[i];
        }


        float maxavg = (float) sum/k;
         for(int i = k ; i< gvn.length-1;i++){
              sum = sum - gvn[i-k] + gvn[i];
             float curravg = (float) sum/k;
             maxavg = Math.max(maxavg,curravg);
         }
         return maxavg;
    }
}
