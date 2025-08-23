public class Transaction {
    private Trader trader;
    private double amount;

    public Transaction(Trader trader, double amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public double getAmount() {
        return amount;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{trader=" + trader + ", amount=" + amount + "}";
    }
}
