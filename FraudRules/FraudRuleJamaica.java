package FraudRules;

import TraidingInfo.Transaction;

class FraudRuleJamaica implements FraudRule {
    @Override
    public boolean isFraud(Transaction tx) {
        return tx.getTrader().getCountry().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "Country is Jamaica";
    }
}