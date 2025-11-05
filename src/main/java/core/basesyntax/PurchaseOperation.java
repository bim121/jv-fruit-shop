package core.basesyntax;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction t) {
        Storage.fruitStorage.merge(t.getFruit(), -t.getQuantity(), Integer::sum);
    }
}
