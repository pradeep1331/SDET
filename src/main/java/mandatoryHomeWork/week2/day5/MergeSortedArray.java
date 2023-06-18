package mandatoryHomeWork.week2.day5;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] gvn1 = {1, 2, 3, 0, 0, 0};
        int[] gvn2 = {0, 2, 6};
        merge(gvn1, 3, gvn2, 3);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){



        return nums1;

    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        for (int i = 0; i < n; i++) {
//            nums1[m + i] = nums2[i];
//        }
//        for (int i = 0; i < nums1.length - 1; i++) {
//            for (int j = i + 1; j > 0; j--) {
//                if (nums1[j] < nums1[j - 1]) {
//                    int temp = nums1[j];
//                    nums1[j] = nums1[j - 1];
//                    nums1[j - 1] = temp;
//                } else {
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(nums1));
//
//    }
}

    ///////////////////////////////
      // 1 2 3 0 0 0   i = 2 (3)  j =2(0)
      // 1 2 3

