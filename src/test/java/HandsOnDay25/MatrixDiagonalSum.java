package HandsOnDay25;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] mat = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        int leftSum = 0 ;
        int rightSum = 0 ;
        int length = mat.length;
        // to find left Sum
        for (int i = 0; i < length; i++) {
            leftSum = leftSum + mat[i][i];
        }

        // to find right Sum
        for (int i = 0; i < length; i++) {
            rightSum = rightSum + mat[i][length-i-1];
        }



    }

}
