package assignment3;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String Input = sc.nextLine();
        String[] words = Input.split(" ");
        StringBuilder Reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            Reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed Sentence:");
        System.out.println(Reversed.toString().trim());
    }
}
