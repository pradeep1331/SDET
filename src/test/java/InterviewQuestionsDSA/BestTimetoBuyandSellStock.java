package InterviewQuestionsDSA;

public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {




    }


     public static int BuySellDiff (int[] prices){

        int max = Integer.MIN_VALUE ; int left = 0 , right = 1;

        int minNum = Integer.MAX_VALUE;

        while(right<prices.length){

            if(prices[left]<minNum){
                minNum = prices[left];
            }

            if(prices[left]<prices[right]){

                max = Math.max(max,prices[right]-minNum);
                left=right;
                right++;
            }

            right++;

        }

        return max;

     }


}
