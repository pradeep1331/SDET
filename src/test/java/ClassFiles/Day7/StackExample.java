package ClassFiles.Day7;

public class StackExample {


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('A');
    }
}

class Stack{

    private int size = 50;
    private Character stack[] = new Character[50];
    private int top = 0;

    boolean push (Character ele){
        if(top<size){
            stack[top] = ele;
            top++;
            return true;
        }
        System.out.println("Stack out of size");
        return false;
    }

    Character pop (){
        if(top>0){
            Character popele = stack[top];
            stack[top]= null;
            return popele;
        }
        System.out.println("Empty Stack");
        return null;
    }
    int Size(){
        return size;
    }
    int contains(Character ele) {
        for (int i = 0; i < top; i++) {
            if (stack[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    Character peek() {
        if (top > 0)  return stack[top - 1];
        System.out.println("Stack is empty");
        return null;
    }

}

