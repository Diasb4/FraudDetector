package FraudRules;

import TraidingInfo.Transaction;

public class FraudRuleGermanyAmount implements FraudRule {
    @Override
    public boolean isFraud(Transaction tx) {
        return tx.getAmount() > 1_000_000 && tx.getTrader().getCountry().equals("Germany");
    }

    @Override
    public String getRuleName() {
        return "Germany: Amount too high";
    }
}
