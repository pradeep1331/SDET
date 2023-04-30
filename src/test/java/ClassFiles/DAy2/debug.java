package ClassFiles.DAy2;

public class debug {

    public static void main(String[] args) {

//        Ex1: [1,2,3,4,5], 2, 4      Output: true
//        Ex2: [1,2,3,4,5], 2, 6      Output: false
         int[] gvn1 = {1,2,3,4,5};
        System.out.println(findNos(gvn1,2,4));
        System.out.println(findNos(gvn1,2,6));

    }


    public static boolean findNos (int []arr, int x, int y) {

        boolean flagx = false;
        boolean flagy = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x ) flagx = true;
            if( arr[i] == y)  flagy = true;
            }
        if (flagx && flagy) return true;
        else return false;
        }
    }

