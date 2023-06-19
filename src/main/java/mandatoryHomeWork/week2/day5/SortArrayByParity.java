package mandatoryHomeWork.week2.day5;


import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {

        int[] gvn ={3,1,2,4};
        int[] gvn1 ={0};
        int[] gvn2 ={3,2};
        int[] gvn3 ={3,5,7};
        System.out.println(Arrays.toString(sortEven(gvn)));
        System.out.println(Arrays.toString(sortEven(gvn1)));
        System.out.println(Arrays.toString(sortEven(gvn2)));
        System.out.println(Arrays.toString(sortEven(gvn3)));
    }

    public static int[] sortEven(int[] arr){

             int left = 0 , right = 1;
             if(arr.length==0){
                 return arr;
             }
             while(right<arr.length){
                 if(arr[right] %2==0){
                     int temp = arr[left];
                     arr[left] = arr[right];
                     arr[right] = temp;
                     left++;
                     right++;
                 }else {
                     right++;
                 }
             }
        return arr;

    }
}
