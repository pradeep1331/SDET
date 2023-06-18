package mandatoryHomeWork.week3.day4;

import java.util.ArrayList;
import java.util.List;

public class SortingtheSentence {

    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));

    }

    public static String sortSentence(String s) {
        String arr[]=s.split(" ");
        List list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(" ");
        }
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            String index=str.substring(str.length()-1);
            int index1=Integer.parseInt(index);
            list.set(index1-1,str.substring(0,str.length()-1));
        }
        String res="";
        for(int i=0;i<list.size();i++){
            res+=list.get(i)+" ";
        }
        return res.trim();
    }
}
