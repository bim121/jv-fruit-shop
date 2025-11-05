package core.basesyntax;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy strategy;

    public ShopServiceImpl(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction t : transactions) {
            strategy.getHandler(t.getOperation()).apply(t);
        }
    }
}
