package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction t) {
        int currentQty = Storage.getQuantity(t.getFruit());
        if (currentQty < t.getQuantity()) {
            throw new RuntimeException("Not enough " + t.getFruit() + " in stock for purchase. Current: "
                    + currentQty + ", requested: " + t.getQuantity());
        }
        Storage.addQuantity(t.getFruit(), -t.getQuantity());
    }
}
