import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    private List<Transaction> transactions;

    public FraudDetector() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void detectFraud() {
        for (Transaction tx : transactions) {
            if (isAmountTooHigh(tx) || isPokemonTrader(tx) || isFromSydney(tx)
                    || isFromJamaica(tx) || isGermanBigTransaction(tx)) {
                System.out.println("Fraud detected: " + tx);
            }
        }
    }

    private boolean isAmountTooHigh(Transaction tx) {
        return tx.getAmount() > 1_000_000;
    }

    private boolean isPokemonTrader(Transaction tx) {
        return tx.getTrader().getName().equals("Pokemon");
    }

    private boolean isFromSydney(Transaction tx) {
        return tx.getTrader().getCity().equals("Sydney");
    }

    private boolean isFromJamaica(Transaction tx) {
        return tx.getTrader().getCountry().equals("Jamaica");
    }

    private boolean isGermanBigTransaction(Transaction tx) {
        return tx.getTrader().getCountry().equals("Germany") && tx.getAmount() > 1000;
    }

    public static void main(String[] args) {
        FraudDetector detector = new FraudDetector();

        Trader trader1 = new Trader("Alice", "New York", "USA");
        Trader trader2 = new Trader("Bob", "Los Angeles", "Jamaica");
        Trader trader3 = new Trader("Pokemon", "Pallet Town", "Japan");
        Trader trader4 = new Trader("Charlie", "London", "UK");

        Transaction tx1 = new Transaction(trader1, 5000);
        Transaction tx2 = new Transaction(trader2, 1500000);
        Transaction tx3 = new Transaction(trader3, 2000);
        Transaction tx4 = new Transaction(trader4, 3000);

        detector.addTransaction(tx1);
        detector.addTransaction(tx2);
        detector.addTransaction(tx3);
        detector.addTransaction(tx4);

        detector.detectFraud();
    }
}