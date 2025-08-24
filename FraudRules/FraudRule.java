package FraudRules;

import TraidingInfo.Transaction;

public interface FraudRule {
    boolean isFraud(Transaction tx);

    String getRuleName();
}