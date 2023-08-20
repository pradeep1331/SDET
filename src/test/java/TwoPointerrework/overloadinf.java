package TwoPointerrework;

public class overloadinf {

    // increases readablity , clean code practical use = assert.True
    // same method name - but different param list or param type should change
    //  return type change does'nt constitute over loading
    // this is done complile time
    public static void main(String[] args) {

        System.out.println(add(4,4,4));
        System.out.println(add("a","b"));

    }


    public int add(int a, int b){

        return a+b;
    }
    public static String add(String a , String b){

        return a+b;
    }
    public static int add(int a , int b,int c){
        return a+b+c;
    }





}
