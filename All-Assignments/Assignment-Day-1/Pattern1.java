package assignment1;

public class Pattern1 {
    public static void main(String[] args) {
        int rows = 4;  // Number of rows for the pattern

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
    }
}
