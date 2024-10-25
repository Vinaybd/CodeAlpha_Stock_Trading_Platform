
// package tradingplatform;



public class Transaction {

    public static void buyStock(User user, String symbol, int quantity, MarketData marketData) {
        double stockPrice = marketData.getStockPrice(symbol);
        double totalCost = stockPrice * quantity;

        try {
            user.subtractFunds(totalCost);
            user.getPortfolio().buyStock(symbol, quantity);
            System.out.println("Bought " + quantity + " shares of " + symbol + " for $" + totalCost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sellStock(User user, String symbol, int quantity, MarketData marketData) {
        double stockPrice = marketData.getStockPrice(symbol);
        double totalRevenue = stockPrice * quantity;

        try {
            user.getPortfolio().sellStock(symbol, quantity);
            user.addFunds(totalRevenue);
            System.out.println("Sold " + quantity + " shares of " + symbol + " for $" + totalRevenue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



