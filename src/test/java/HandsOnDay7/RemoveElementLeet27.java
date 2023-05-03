package HandsOnDay7;

import java.util.Arrays;

public class RemoveElementLeet27 {

    public static void main(String[] args) {

        int[] gvn = {3, 2, 2, 3};
        int[] gvn1 = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(rmv(gvn,3));
        System.out.println(rmv(gvn1,2));

    }

    private static int rmv(int[] nums,int value) {

        int left = 0, right = 1;

        int[] expectedNums = sort(nums);

        if (expectedNums.length == 0) {
            return left;
        } else {
            for (int i = 0; i < expectedNums.length; i++) {
                while (right < expectedNums.length) {
                    if (expectedNums[right] != value) {
                        int temp = expectedNums[left];
                        expectedNums[left] = expectedNums[right];
                        expectedNums[right] = temp;
                        left++;
                        right++;
                    } else {
                        right++;
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
            return left+1;
        }
    }

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
}
