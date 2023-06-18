package HandsOnDay26;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ProjectEstimates {

    public static void main(String[] args) {

        int[] gvn = {1,2,3,4,5};

    }

    public static int ProjectEstimatesMethod(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 if array is empty or null
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }
}
