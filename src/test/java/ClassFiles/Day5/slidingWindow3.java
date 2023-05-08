package ClassFiles.Day5;

import java.util.HashMap;

public class slidingWindow3 {
    public static void main(String[] args) {

        int[] arr1 = {10,15,-5,15,-10,0};

       // win(arr1,5);

        win2(arr1,5);

    }

    //Brute Force
     public static void win(int[] arr,int target){

         for(int i=0;i<arr.length-1;i++){

             for (int j = 1; j < arr.length; j++) {

                 if(arr[i]+arr[j]==target){
                     System.out.println(arr[i]+" "+arr[j]);
                 }

             }
         }


     }

     //sliding window

     public static void win2(int[] arr2,int target){

         HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
         int sum = 0;

         for (int i = 0; i < arr2.length ; i++) {
             sum += arr2[i];
             hmap.put(sum,i);
         }

         int newsum = 0;

         for (int i = 0 ;i<arr2.length;i++){
             newsum = newsum + arr2[i];
              int diff = newsum - target;

           //  System.out.println(i);
              if(hmap.containsKey((diff))){
                  int start = hmap.get(diff)+1;
                  int end = i;
                  System.out.println(arr2[start]+" "+arr2[end]);
             }
         }
     }
}
