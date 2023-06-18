package mandatoryHomeWork.week6.day2;

public class diagonalSum {

    public static void main(String[] args) {

      int[][] mat = {{1,1,1,1},
              {1,1,1,1},
        {1,1,1,1},
            {1,1,1,1}};

        diagonalSummthd(mat);

    }



    public static int diagonalSummthd(int[][] mat) {

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

        if (length % 2 == 1) {
            int center = length / 2;
            rightSum -= mat[center][center];
        }

        return leftSum + rightSum;

    }
}
