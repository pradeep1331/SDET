package mandatoryHomeWork.week7.day1;

public class flipimage {

    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};

        flipAndInvertImage(image);

    }


    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image){
            int l = 0;
            int r = row.length - 1;

            while(l <= r) {
                int t = row[l] == 1 ? 0 : 1;
                row[l] = row[r] == 1 ? 0 : 1;
                row[r] = t;

                ++l;
                --r;
            }
        }

        return image;
    }
}
