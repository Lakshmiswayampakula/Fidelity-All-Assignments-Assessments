package assignment4.LinkedlistInsertionAtTail;


import java.util.Scanner;

public class LinkedlistMainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements you want to add: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtTail(data);
        }
        System.out.println("The final linked list is: ");
        list.printList();
        sc.close();
    }
}
