import java.util.*;

public class DequeueMain {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque.removeFirst());
    }
}
