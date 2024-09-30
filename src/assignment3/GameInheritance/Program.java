package assignment3.GameInheritance;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a game");
        String game1Name = scanner.nextLine();
        System.out.println("Enter the maximum number of players");
        int game1Players = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Creating an object of the Game class
        Game game1 = new Game(game1Name, game1Players);
        System.out.println(game1);

        // Input for the second game (with time limit)
        System.out.println("Enter a game that has a time limit");
        String game2Name = scanner.nextLine();
        System.out.println("Enter the maximum number of players");
        int game2Players = scanner.nextInt();
        System.out.println("Enter the time limit in minutes");
        int game2TimeLimit = scanner.nextInt();

        // Creating an object of the GameWithTimeLimit class
        GameWithTimeLimit game2 = new GameWithTimeLimit(game2Name, game2Players, game2TimeLimit);
        System.out.println(game2);

        scanner.close();
    }
}
