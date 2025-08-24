import java.util.*;
import TraidingInfo.Trader;
import TraidingInfo.Transaction;
import FraudRules.*;

public class FraudDetector {
    private final List<FraudRule> rules;

    public FraudDetector(List<FraudRule> rules) {
        this.rules = rules;
    }

    public void detectFraud(List<Transaction> transactions) {
        for (Transaction tx : transactions) {
            for (FraudRule rule : rules) {
                if (rule.isFraud(tx)) {
                    System.out.println("Fraud detected: " + tx +
                            " | Rule: " + rule.getRuleName());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Создаем список правил
        List<FraudRule> rules = Arrays.asList(
                new FraudRuleAmount(),
                new FraudRulePokemon(),
                new FraudRuleSydney(),
                new FraudRuleJamaica(),
                new FraudRuleGermanyAmount());

        FraudDetector detector = new FraudDetector(rules);

        // Данные
        Trader trader1 = new Trader("Alice", "New York", "USA");
        Trader trader2 = new Trader("Bob", "Los Angeles", "Jamaica");
        Trader trader3 = new Trader("Pokemon", "Pallet Town", "Japan");
        Trader trader4 = new Trader("Charlie", "London", "UK");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(trader1, 5000),
                new Transaction(trader2, 1500000),
                new Transaction(trader3, 2000),
                new Transaction(trader4, 3000));

        detector.detectFraud(transactions);
    }
}
