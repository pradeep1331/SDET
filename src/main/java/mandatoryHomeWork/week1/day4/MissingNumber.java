package mandatoryHomeWork.week1.day4;

public class MissingNumber {

    public static void main(String[] args) {

        int[] gvn = {3,0,1};
        int[] gvn1 = {0,1};
        int[] gvn2 = {9,6,4,2,3,5,7,0,1};
        System.out.println((returnMissing(gvn)));
        System.out.println((returnMissing(gvn1)));
        System.out.println((returnMissing(gvn2)));
    }

    // To Sort the Array
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }


        return arr;
    }

    // To return arr with missing number

      public static int returnMissing(int[] arr){

        int[] sortedArr = sort(arr);
        int missingNumber = 0;
          for (int i = 0  ; i<sortedArr.length;i++){
              if(i != sortedArr[i]){
                  return sortedArr[i]-1;
              }
          }
           return sortedArr[sortedArr.length-1]+1;
          }
}

