package Java.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> numbers;
    private Stack<Integer> minNumbers;

    public MinStack() {
        numbers=new Stack<>();
        minNumbers=new Stack<>();
    }

    public void push(int val) {
        numbers.push(val);
        if(minNumbers.empty() || val<=minNumbers.peek()){
            minNumbers.push(val);
        }
    }

    public void pop() {
        int popped=numbers.pop();
        if(minNumbers.peek()==popped){
            minNumbers.pop();
        }
    }

    public int top() {
        return numbers.peek();
    }

    public int getMin() {
        return minNumbers.peek();
    }
}
