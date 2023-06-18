package mandatoryHomeWork.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class AdjacentDuplicates {

    public static void main(String[] args) {

        String s = "abbaca";




    }


    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> c = new ArrayList<>();

        int left = 0 ;
        int right = 0 ;

        while(left<a.size() && right <b.size()){
            if(a.get(left)<=b.get(right)){
                c.add(a.get(left));
                left++;
            }else{
                c.add(a.get(right));
                right++;
            }
        }


        if(left<a.size()){
            c.add(a.get(left));
            left++;
        }else if(right<b.size()){
            c.add(b.get(right));
            right++;
        }

        return c;

    }
}
