package assignment3.GameInheritance;

public class GameWithTimeLimit extends Game {
    // Additional property for time limit
    private int timeLimit;

    // Constructor for the GameWithTimeLimit class
    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }

    // Overriding ToString() to include the time limit
    @Override
    public String toString() {
        return super.toString() + "\nTime Limit for " + getName() + " is " + timeLimit + " minutes";
    }
}
