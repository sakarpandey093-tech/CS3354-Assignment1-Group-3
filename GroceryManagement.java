public class GroceryManagement {

    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

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
}
