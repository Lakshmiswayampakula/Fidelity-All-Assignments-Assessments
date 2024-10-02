package assignment4.LinkedlistInsertionAtSpecificPosition;


public class LinkedlistMainProgram {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Creating the linked list with the initial values 16, 13, 7
        list.append(16);
        list.append(13);
        list.append(7);
        // Display the list before insertion
        System.out.print("Initial List: ");
        list.display();
        // Insert 1 at position 2 (0-based index)
        list.insertAtPosition(1, 2);
        // Display the list after insertion
        System.out.print("Updated List: ");
        list.display();
    }
}
