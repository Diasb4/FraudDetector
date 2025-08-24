package FraudRules;

import TraidingInfo.Transaction;

interface FraudRule {
    boolean isFraud(Transaction tx);

    String getRuleName();
}