package core.basesyntax;

public class BalanceOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction t) {
        Storage.fruitStorage.put(t.getFruit(), t.getQuantity());
    }
}
