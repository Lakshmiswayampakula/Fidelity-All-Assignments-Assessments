package assignment4.ReverseLinkedlist;

public class ReverseLinkedlistMainProgram {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Adding nodes to the linked list (1, 2, 3, 4, 5)
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        // Printing original list
        System.out.println("Original Linked List:");
        list.printList(list.head);
        // Reversing the linked list
        list.head = list.reverse(list.head);
        // Printing reversed list
        System.out.println("\nReversed Linked List:");
        list.printList(list.head);
    }
}
