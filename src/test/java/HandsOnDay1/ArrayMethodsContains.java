package HandsOnDay1;

public class ArrayMethodsContains {
    public static void main(String[] args) {

        int[] gvn = {1,2,4,5,6,7};
        int[] gvn1 = {1,2,3,4};

        System.out.println(contains(gvn,4));

        System.out.println(contains(gvn1,5));

    }

    public static boolean contains (int[] arr,int value){


          boolean flag = false;

          int  left = 0 , right = arr.length-1;

            while(left <= right){
                if (arr[left] == value || arr[right] ==value){
                    flag = true;
                    break;
                }else{
                    ++left;
                    --right;
                }
            }

        return flag;


    }
}
