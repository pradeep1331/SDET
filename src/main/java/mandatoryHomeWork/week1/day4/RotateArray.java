package mandatoryHomeWork.week1.day4;

public class RotateArray {

    public static void main(String[] args) {

        int[] gvn = {1,2,3,4,5};
        rotateArr(gvn,2);
     }

     public static void rotateArr(int[] arr , int gvn){


          int[] rotatedArray = new int[arr.length];
          int n = 0 ;

              if( arr.length > gvn ) n = gvn % arr.length;
              else n = gvn;


              for (int i = arr.length-1 ; i< n;i-- ){

                  rotatedArray[i] = arr[i];

              }




     }

}
