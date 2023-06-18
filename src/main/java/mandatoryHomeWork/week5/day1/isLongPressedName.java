package mandatoryHomeWork.week5.day1;

public class isLongPressedName {

    public static void main(String[] args) {

        System.out.println(isLongPressedName("alex","aaleex"));
    }



    public static boolean isLongPressedName(String name, String typed) {

        int n = name.length(); int m = typed.length();

        int i = 0 , j =0;

        if(name.equals(typed)){
            return true;
        }
        if (n > m) {
            return false;
        }
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j != 0 && typed.charAt(j) == name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }




        return i== name.length() ;
    }



}

