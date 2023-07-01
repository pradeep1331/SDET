package BinaryProblems;

public class FirstLastPositionSortedArray {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters1 =  {'c','f','j'};
        char[] letters2 = {'x','x','y','y'};
        System.out.println(getchar(letters1,'x'));
    }

    private static char getchar(char[] letters,char target){
         int start = 0 , end = letters.length-1;
         while (start<=end){
             int mid = start + (end-start)/2;

             if(target <letters[mid]){
                 end = mid-1;
             } else  {
                 start = mid+1;
             }
         }
         return letters[start%(letters.length)];
    }
}
