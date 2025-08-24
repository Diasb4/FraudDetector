package FraudRules;

import TraidingInfo.Transaction;

public class FraudRuleSydney implements FraudRule {
    @Override
    public boolean isFraud(Transaction tx) {
        return tx.getTrader().getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return "City is Sydney";
    }
}