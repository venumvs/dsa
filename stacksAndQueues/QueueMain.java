import java.util.*;
public class QueueMain{
    public static void main(String[] args) throws Exception{
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // System.out.println(queue.remove());
        CustomQueue queue = new CustomQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove());
    }
}