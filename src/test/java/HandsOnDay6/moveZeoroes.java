package HandsOnDay6;

import java.util.Arrays;

public class moveZeoroes {

    public static void main(String[] args) {

        int[] gvn1 = {0, 1, 0, 3, 12};
        int[] gvn2 = {0};

        mveZero(gvn1);
        mveZero(gvn2);

    }

    private static int[] mveZero(int[] nums) {

        int left = 0, right = 1;

        Arrays.sort(nums);
        if (nums.length == 0) {
            return nums;
        } else {
            for (int i = 0; i < nums.length; i++) {
                while (right < nums.length) {
                    if (nums[right] != 0) {
                        int temp = nums[left];
                        nums[left] = nums[right];
                        nums[right] = temp;
                        left++;
                        right++;
                    } else {
                        right++;
                    }
                }
            }
            return nums;
        }
    }
}

