package core.basesyntax;

public class SupplyOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction t) {
        Storage.fruitStorage.merge(t.getFruit(), t.getQuantity(), Integer::sum);
    }
}
