// package tradingplatform;


import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> holdings;

    public Portfolio() {
        holdings = new HashMap<>();
    }

    // Add stock to portfolio
    public void buyStock(String symbol, int quantity) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
    }

    // Sell stock from portfolio
    public void sellStock(String symbol, int quantity) throws Exception {
        if (!holdings.containsKey(symbol) || holdings.get(symbol) < quantity) {
            throw new Exception("Not enough shares to sell");
        }
        holdings.put(symbol, holdings.get(symbol) - quantity);
    }

    // Display portfolio holdings
    public void displayHoldings() {
        System.out.println("Your Portfolio:");
        for (Map.Entry<String, Integer> entry : holdings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
    }
}
