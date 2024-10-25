// package tradingplatform;


public class User {
    private String name;
    private double funds;
    private Portfolio portfolio;

    public User(String name, double initialFunds) {
        this.name = name;
        this.funds = initialFunds;
        this.portfolio = new Portfolio();
    }

    public double getFunds() {
        return funds;
    }

    public void addFunds(double amount) {
        funds += amount;
    }

    public void subtractFunds(double amount) throws Exception {
        if (funds < amount) {
            throw new Exception("Insufficient funds");
        }
        funds -= amount;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    // Display user info
    public void displayUserInfo() {
        System.out.println("User: " + name);
        System.out.println("Available Funds: $" + funds);
        portfolio.displayHoldings();
    }
}
