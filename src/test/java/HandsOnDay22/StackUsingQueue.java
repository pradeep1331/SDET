package HandsOnDay22;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {

    }
}

class MyStack {

     Queue<Integer> s1 ;

    public MyStack() {

        s1 = new LinkedList<>();

    }

    public void push(int x) {

        s1.add(x);

    }

    public int pop() {

        return s1.remove();

    }

    public int top() {

        return s1.peek();

    }

    public boolean empty() {

        return s1.isEmpty();

    }
}
