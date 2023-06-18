package mandatoryHomeWork.week6.day3;

public class xMatrix {
    public static void main(String[] args) {

        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};

        checkXMatrix(grid);

    }

    public static boolean checkXMatrix(int[][] grid) {


        int n=grid.length;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==j || i+j+1==n)
                {
                    if(grid[i][j]==0) return false;
                }
                else
                {
                    if(grid[i][j]!=0) return false;
                }
            }
        }
        return true;
    }
}
