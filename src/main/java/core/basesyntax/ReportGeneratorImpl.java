package core.basesyntax;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        StringBuilder sb = new StringBuilder("fruit,quantity\n");
        Storage.fruitStorage.forEach((fruit, qty) -> sb.append(fruit)
                .append(",").append(qty).append("\n"));
        return sb.toString();
    }
}
