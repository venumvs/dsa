import java.util.*;

public class LinkedList{
    public Node head;
    public Node tail;
    public int size;
    public LinkedList(){
        this.size = 0;
    }
    public class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
        }
        public Node(int data, Node next){
            this.value = data;
            this.next = next;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = head;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
}
