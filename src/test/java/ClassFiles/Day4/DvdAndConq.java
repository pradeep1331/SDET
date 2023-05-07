package ClassFiles.Day4;

public class DvdAndConq {

    public static void main(String[] args) {

        int[] gvn = {0,0,0,0,1,1};
        int[] gvn1 = {0,1,1,1,1,1};
        System.out.println(count(gvn));
        System.out.println(count(gvn1));

    }

    public static int count(int[] arr) {
        if (arr.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        int mid = 0;
        while (left <= right) {
            mid = (left + right)/2;
           if(arr[mid]==0){


           }
        }
        count = (arr.length - mid);
        return count;
    }

//    public static int countOnes(int[] gvn) {
//        int start = 0, end = gvn.length - 1, count = 0, n = gvn.length;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (gvn[mid] == 1) {
//                count += mid - start + 1;
//                if (mid > 0 && gvn[mid-1] == 1) {
//                    end = mid - 1;
//                } else {
//                    break;
//                }
//            } else {
//                start = mid + 1;
//            }
//
//
//        }
//        return count;
//    }



}
