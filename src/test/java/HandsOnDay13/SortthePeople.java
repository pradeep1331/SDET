package HandsOnDay13;

import java.util.Arrays;

public class SortthePeople {
    public static void main(String[] args) {

        String[] gvn1 ={"Mary","John","Emma"};
        int[] gvn2 = {180,165,170};

        sort(gvn1,gvn2);

    }


    public static void sort(String[] names, int[] heights) {
        if (names == null || heights == null || names.length != heights.length) {
            // handle invalid input
            return;
        }

        for (int i = 0; i < heights.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[maxIndex]) {  // modified comparison
                    maxIndex = j;
                }
            }
            // swap the smallest element with the current pivot element
            int tempHeight = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = tempHeight;

            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(heights));
    }
}
