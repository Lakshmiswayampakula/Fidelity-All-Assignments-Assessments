package assignment3.GameInheritance;

import java.util.Scanner;
public class Game {
    private String name;
    private int maximumNumPlayers;
    public Game(String name, int maxNumPlayers) {
        this.name = name;
        this.maximumNumPlayers = maxNumPlayers;
    }
    public String getName() {
        return name;
    }
    public int getMaxNumPlayers() {
        return maximumNumPlayers;
    }
    @Override
    public String toString() {
        return "Maximum number of players for " + name + " is " + maximumNumPlayers;
    }
}