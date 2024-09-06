import java.util.*;
public class LinkedList{
    static Node head;
    static classNode{
        int data;
        Node next;
        Node(int d){
            data= d;
            next = null;
        }
    }

    static public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head =new_node;
    }
    
}
