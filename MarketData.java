// package tradingplatform;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MarketData {
    private Map<String, Stock> stockMarket;

    public MarketData() {
        stockMarket = new HashMap<>();
        // Simulating some initial stock prices
        stockMarket.put("AAPL", new Stock("AAPL", 150.00));
        stockMarket.put("GOOGL", new Stock("GOOGL", 2800.00));
        stockMarket.put("AMZN", new Stock("AMZN", 3300.00));
    }

    // Simulate stock prices changing
    public void updateMarketPrices() {
        Random random = new Random();
        for (Stock stock : stockMarket.values()) {
            double change = random.nextDouble() * 10 - 5;  // Price changes between -5 to +5
            stock.setPrice(stock.getPrice() + change);
        }
    }

    // Get current stock price
    public double getStockPrice(String symbol) {
        return stockMarket.get(symbol).getPrice();
    }

    // Display current market data
    public void displayMarketData() {
        System.out.println("Stock Market Data:");
        for (Stock stock : stockMarket.values()) {
            System.out.println(stock.getSymbol() + ": $" + stock.getPrice());
        }
    }
}

