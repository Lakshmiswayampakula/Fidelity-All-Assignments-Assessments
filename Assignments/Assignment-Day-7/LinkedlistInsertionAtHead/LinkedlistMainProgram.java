package assignment4.LinkedlistInsertionAtHead;

import java.util.Scanner;

public class LinkedlistMainProgram {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Linkedlist");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Linkedlist");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtHead(value);
        }
        System.out.println("The linkedList elements are: ");
        list.printList();
    }
}
