import java.util.Scanner;

/**
 * A grocery management system that tracks items using parallel arrays.
 * Item names, prices, and stock counts are stored in three arrays, where
 * the same index in each array refers to the same item. A menu lets the
 * user view the inventory, restock an item, or exit.
 *
 * @author Sakar Pandey
 * @author Johnny Reed
 * @author Danylo Huk
 * @author Niruta Chataut
 * @author Mohamed Adeel Rahman
 * 
 */

public class GroceryManagement {
    
    /**
     * Creates the parallel arrays and runs the menu loop. The user can
     * enter 1 to view the inventory, 2 to restock an item, or 3 to exit.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample data for testing
        itemNames[0] = "Milk";   itemPrices[0] = 3.49; itemStocks[0] = 10;
        itemNames[1] = "Bread";  itemPrices[1] = 2.99; itemStocks[1] = 15;
        itemNames[2] = "Eggs";   itemPrices[2] = 4.25; itemStocks[2] = 12;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Grocery Management Software");
            System.out.println("MENU");
            System.out.println("Type 1 to display the inventory");
            System.out.println("Type 2 to restock an item");
            System.out.println("Type 3 to exit");

            int option = input.nextInt();
            input.nextLine();

            if(option == 1){
                printInventory(itemNames, itemPrices, itemStocks);
            } else if(option == 2){
                System.out.println("What would you like to add?");
                String target = input.nextLine();
                System.out.println("Amount?");
                int amount = input.nextInt();
                input.nextLine();
                restockItem(itemNames, itemStocks, target, amount);
            } else if(option == 3){
                break;
            } else{
                System.out.println("Invalid option.");
            }
        }
    input.close();
    }
     /**
     * Prints the items that are in the inventory.
     *
     * @param names names of the items
     * @param prices prices of the items
     * @param stocks amount of items in stock
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {
                System.out.println("Item: " + names[i] + ", Price: $" 
                        + prices[i] + ", Stock: " + stocks[i]);
            } else {
                continue;
            }
        }
    }
    /**
     * 
     * Restocks an item in the inventory by adding the specified amount to its stock.
     *   If the item is not found, it prints a message indicating so.
     * @param names names of the items
     * @param stocks amount of items in stock
     * @param target name of item to restock
     * @param amount amount to add to the stock of the item
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}