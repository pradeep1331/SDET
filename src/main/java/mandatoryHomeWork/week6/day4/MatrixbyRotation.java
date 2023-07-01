package mandatoryHomeWork.week6.day4;

import java.util.Arrays;

public class MatrixbyRotation {

    public static void main(String[] args) {

        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };

        System.out.println(findRotation(mat,target));

    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    private static void rotate(int[][] mat) {

        for (int i = 0, j = mat.length - 1; i < j; i++, j--) {
            int[] tempRow = mat[i];
            mat[i] = mat[j];
            mat[j] = tempRow;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}

