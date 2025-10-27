import java.util.*;
public class CustomStack {
    public static final int default_size = 10;
    public int[] data;
    int ptr = -1;

    public CustomStack(){
        this(default_size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == 0;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    

}
