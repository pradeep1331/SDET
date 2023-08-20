package TwoPointerrework;


 // Over riding is same method name in super and sub class
// sub class will automatically over ride . WIll take methid from Sub class
// during Run Time
public class Overriding  extends overloadinf{
    public static void main(String[] args) {

        Overriding over = new Overriding();
        System.out.println(over.add(4,10));



    }

    @Override
    public int add(int a, int b){
        return a+5;
    }





}
