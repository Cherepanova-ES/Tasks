package task6;
import java.util.List;
import java.util.ArrayList;

public class StatisticalAnalyzer extends AbstractDataAnalyzer {

    @Override
    protected void performAnalysis(Data data) {
        System.out.println("Performing statistical analysis...");
        List<Double> values = data.getValues();
        double mean = values.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Mean: " + mean);
        // Добавьте другие статистические вычисления
    }
}
