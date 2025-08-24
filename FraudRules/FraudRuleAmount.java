package FraudRules;

import TraidingInfo.Transaction;

public class FraudRuleAmount implements FraudRule {
    @Override
    public boolean isFraud(Transaction tx) {
        return tx.getAmount() > 1_000_000;
    }

    @Override
    public String getRuleName() {
        return "Amount too high ";

    }
}