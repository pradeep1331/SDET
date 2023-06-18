package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class ArrayMethdsAddSpecificIndex {
//    . Implement below methods using array
//    a. add to the specific index
//    b. print the array value as string
//    c. contains
//    d. remove a value
//    e. trim to the given length

    //Pseudo
    // take arr and create new array with value on more than gvn one
    // loop through values and add in new array
    // if in condition the value is matching the given index add that in new array
    // else add in same location of
    // break it into 2 for loops as observed in class One
    // first half till it reaches index
    // second for loop will iterate from index to last value
    // edge case gvn array has only one value
    // edge case gvn array has zero value and need to add to index

    public static void main(String[] args) {

        int gvn[] = {1,2,3,5,6};
        int gvn1[] = {1};
        int gvn3[] = {};

        addtoIndex(gvn,4,3);
        addtoIndex(gvn1,2,1);
        addtoIndex(gvn3,1,0);


    }



    public static void addtoIndex(int[] arr,int value,int index){

        int[] newArr = new int[arr.length +1];

        int val = 0;

        for(int i = 0;i< newArr.length;i++){
            if(i == index){
                newArr[i] = value;
                val = i ;
                break;
            }else {
                newArr[i]  = arr[i];
            }
        }
        int j = val;
        for(;j<newArr.length-1;j++){
            newArr[j+1] = arr[j];
        }
        System.out.println(Arrays.toString(newArr));
}

}
