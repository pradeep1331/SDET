package mandatoryHomeWork.week5.day3;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> read;
    private Stack<Integer> write;

    public MyQueue() {

        read = new Stack<>();
        write = new Stack<>();

    }

    public void push(int x) {

        if(write.isEmpty()){
            write.push(x);
        }

    }

    public int pop() {
        while(!write.empty()){
            read.push(write.pop());
        }

        while (!read.empty()){
            write.push(read.pop());
        }

    return read.pop();
    }

    public int peek() {

         return write.peek();

    }

    public boolean empty() {
        return write.isEmpty();
    }
}