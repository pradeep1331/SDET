package HandsOnDay7;

public class mergeArr {
    public static void main(String[] args) {

        System.out.println(mrgArr("abc","pqr"));
        System.out.println(mrgArr("ab","pqrs"));



    }

    public static String mrgArr(String word1,String word2){

        StringBuilder s1= new StringBuilder(" ");
        int left = 0 ,stpLen;
         if(word1.length()<=word2.length()) stpLen= word1.length()-1;
         else stpLen = word2.length()-1;
          while(left<=stpLen){
              s1.append(word1.charAt(left));
              s1.append(word2.charAt(left));
              left++;
          }

          if(word1.length()-1>stpLen) {
              return s1.toString() + word1.substring(stpLen+1);
          }else if(word2.length()-1>stpLen) {

              return s1.toString() + word2.substring(stpLen+1);
          }else {
              return s1.toString();
          }



    }
}
