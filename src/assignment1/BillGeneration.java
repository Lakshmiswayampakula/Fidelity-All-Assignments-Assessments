package assignment1;

public class BillGeneration {
    public static void generateBill(int pizzas, int puffs, int pepsi) {
        int pricePerPizza = 200;
        int pricePerPuff = 40;
        int pricePerPepsi = 120;

        int totalCostPizzas = pizzas * pricePerPizza;
        int totalCostPuffs = puffs * pricePerPuff;
        int totalCostPepsi = pepsi * pricePerPepsi;
        int grandTotal = totalCostPizzas + totalCostPuffs + totalCostPepsi;

        System.out.println("Total cost of pizzas: Rs. " + totalCostPizzas);
        System.out.println("Total cost of puffs: Rs. " + totalCostPuffs);
        System.out.println("Total cost of pepsi: Rs. " + totalCostPepsi);
        System.out.println("Grand total: Rs. " + grandTotal);
    }

    public static void main(String[] args) {
        int numberOfPizzas = 5;
        int numberOfPuffs = 6;
        int numberOfPepsi = 3;

        generateBill(numberOfPizzas, numberOfPuffs, numberOfPepsi);
    }
}
