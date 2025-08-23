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
            if (tx.getAmount() > 1000000) {
                System.out.println("Fraud detected: " + tx);
            }
            if (tx.getTrader().getName().equals("Pokemon")) {
                System.out.println("Fraud detected: " + tx);
            }
            if (tx.getTrader().getCity().equals("Sydney ")) {
                System.out.println("Fraud detected: " + tx);
            }
            if (tx.getTrader().getCountry().equals("Jamaica")) {
                System.out.println("Fraud detected: " + tx);
            }
        }
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