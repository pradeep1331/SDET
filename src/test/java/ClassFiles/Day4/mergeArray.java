package ClassFiles.Day4;

import java.util.Arrays;

public class mergeArray {

    public static void main(String[] args) {
        int[] gvn1 = {1,2,4,5};
        int [] gvn2 = {3,6};

        merge(gvn1,gvn2);

    }

    public static void merge(int[] gvn1, int[] gvn2) {
        int[] newArr = new int[gvn1.length + gvn2.length];
        int left = 0, right = 0, pos = 0;

        while (pos < newArr.length) {
            if (left >= gvn1.length) {
                newArr[pos] = gvn2[right];
                right++;
                pos++;
            } else if (right >= gvn2.length) {
                newArr[pos] = gvn1[left];
                left++;
                pos++;
            } else if (gvn1[left] < gvn2[right]) {
                newArr[pos] = gvn1[left];
                left++;
                pos++;
            } else {
                newArr[pos] = gvn2[right];
                right++;
                pos++;
            }

        }

        System.out.println(Arrays.toString(newArr));
    }

}
