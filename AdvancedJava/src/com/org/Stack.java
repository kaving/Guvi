import java.util.ArrayList;
import java.util.List;

package com.org;

public class Stack {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }
    
    public void push(int value) {
        stack.add(value);
    }
    
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

}
