package FraudRules;

import TraidingInfo.Transaction;

class FraudRulePokemon implements FraudRule {
    @Override
    public boolean isFraud(Transaction tx) {
        return tx.getTrader().getName().equals("Pokemon");
    }

    @Override
    public String getRuleName() {
        return "Trader name is Pokemon";
    }
}