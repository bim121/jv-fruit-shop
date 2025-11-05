package core.basesyntax;

public class ReturnOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction t) {
        Storage.fruitStorage.merge(t.getFruit(), t.getQuantity(), Integer::sum);
    }
}
