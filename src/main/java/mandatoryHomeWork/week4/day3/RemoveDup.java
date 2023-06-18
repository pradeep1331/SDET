package mandatoryHomeWork.week4.day3;

import java.util.Stack;

class RemoveDup {
    public String removeDuplicates(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
            }
            else stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}