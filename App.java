// package tradingplatform;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize market and user
        MarketData marketData = new MarketData();
        User user = new User("John Doe", 10000.00);

        while (true) {
            System.out.println("\n1. View Market Data\n2. View Portfolio\n3. Buy Stock\n4. Sell Stock\n5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    marketData.displayMarketData();
                    break;
                case 2:
                    user.displayUserInfo();
                    break;
                case 3:
                    System.out.println("Enter stock symbol to buy: ");
                    String symbolBuy = scanner.next();
                    System.out.println("Enter quantity to buy: ");
                    int quantityBuy = scanner.nextInt();
                    Transaction.buyStock(user, symbolBuy, quantityBuy, marketData);
                    break;
                case 4:
                    System.out.println("Enter stock symbol to sell: ");
                    String symbolSell = scanner.next();
                    System.out.println("Enter quantity to sell: ");
                    int quantitySell = scanner.nextInt();
                    Transaction.sellStock(user, symbolSell, quantitySell, marketData);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
            }

            // Simulate stock price changes
            marketData.updateMarketPrices();
        }
    }
}

