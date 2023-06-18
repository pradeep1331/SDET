package mandatoryHomeWork.week1.day3;

public class PowerOfTwo {
    //Given an integer n, return true if it is a power of two
    public static void main(String[] args) {
        System.out.println(ispower(1));
        System.out.println(ispower(16));
        System.out.println(ispower(-16));

    }

    public static boolean ispower(int gvn) {
        if(gvn < 0){
            return false;
            }else if(gvn == 1){
            return true;
            }else {
            while (gvn>1){
                if(gvn%2!=0){
                    return false;
                }
                 gvn =  gvn/2;
            }
             return true;
        }
    }
}
