package InterviewQuestionsDSA;

import java.util.*;

public class Container {

    public static void main(String[] args) {
        int[] gvn1 = {1,1};
        System.out.println(Containerwater(gvn1));

        ArrayList<int[]> s1 = new ArrayList<>();

        Set<List<Integer>> ans = new HashSet<>();

//
//        ArrayList<Integer> currlist = new ArrayList<>();
//        currlist.add(1);
//        currlist.add(0);
//        currlist.add(-1);
//
//        ans.add(currlist);

        ans.add(Arrays.asList(-1,0,-1));

        System.out.println(ans);
    }
    private static int Containerwater(int[] gvn){
        int max = Integer.MIN_VALUE , min=Integer.MAX_VALUE;
        int left = 0 , right = gvn.length-1;
         while(left<=right){
          if(gvn[left]<gvn[right]){
              max = Math.max(max,gvn[right]);
              min = Math.min(min,gvn[left]);
          }else{
              max = Math.max(max,gvn[left]);
              min = Math.min(min,gvn[right]);
          }
          left++;
          right--;
      }
         System.out.println(max);
         System.out.println(min);
         int container = max - min;
         return container * container;
    }


}
