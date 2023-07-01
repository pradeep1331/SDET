public class slidingWindow {

    public static void main(String[] args) {
        String s = "aababcabc";   // {1,2,3,4,5,6,7} 3
        goodstr(s,3);
    }
    private static void goodstr(String str,int k){
        int counter = 0;
        StringBuilder s = new StringBuilder();
        int n = str.length();
        for (int i = 0; i <n; i++) {
            s.append(str.charAt(i));
            if(i>k-1){
                s.replace(0,1,"");
            }
            System.out.println(s);
        }

    }



}
