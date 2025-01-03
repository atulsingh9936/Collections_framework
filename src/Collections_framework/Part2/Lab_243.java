package Collections_framework.Part2;

import java.util.Stack;

public class Lab_243 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("c");
        stack.add("D");
        System.out.println(stack);
       // System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
