import java.util.*;
public class CustomQueue {
    public int[] data;
    public static final int default_size = 10;
    int end = 0;
    public CustomQueue(){
        this(default_size);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }   
    public boolean isFull(){
        return data.length-1 == end;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false; 
        }
        end++;
        data[end] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = data[0];
        //move all the data items in data to the left
        for(int i=0;i<data.length;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[0];

    }
    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+" ");
        }
        System.out.println("END");  
    }

    
}
