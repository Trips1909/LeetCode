import java.util.*;

class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}
public class sll_insertion {
    public static Node push(Node head,int new_data){
        Node new_node =new Node(new_data);

        new_node.next=head;
        head=new_node;
        return head;//Return the new head of the list
    }

    public void insertAfter(Node prev_node,int new_data){
        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node =new Node(new_data);

        new_node.next= prev_node.next;
        prev_node.next=new_node;
    }

    public static void main(String []args){
        int arr[]={1,2,3,4};

        Node head= new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);

        head=push(head,5);
        

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
}
