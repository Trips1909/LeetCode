class Node {
    int data;
    Node next;

    // Constructor for creating a new node with given data
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class sll_traversal {
    // Recursive function to traverse the linked list
    public static void traverseList(Node ptr)
    {
        if (ptr == null) {
            System.out.println();
            return;
        }
        System.out.print(ptr.data + " ");
        traverseList(ptr.next);
    }
    public static void main(String[] args)
    {

        // Define the head of the linked list;
        Node head = new Node(10);
        // Inserting some elements in the list
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        traverseList(head);
    }
}
