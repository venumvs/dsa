import java.util.*;

public class stackMain{
    public static void main(String[] args) throws Exception{
        // Stack<Integer> st = new Stack<Integer>();
        // st.push(23);
        // st.push(33);
        // st.push(43);
        // st.push(53);
        // System.out.println(st.pop());
        // CustomStack stack = new CustomStack(5);
        // stack.push(23);
        // stack.push(33);
        // stack.push(43);
        // stack.push(53);
        // stack.push(63);
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        dynamicStack stack = new dynamicStack();
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(63);
        stack.push(1900);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}