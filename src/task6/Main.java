package task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));

        DataAnalyzer statisticalAnalyzer = new StatisticalAnalyzer();
        statisticalAnalyzer.analyze(data);

        DataAnalyzer machineLearningAnalyzer = new MachineLearningAnalyzer();
        machineLearningAnalyzer.analyze(data);

        DataAnalyzer geneticAlgorithmAnalyzer = new GeneticAlgorithmAnalyzer();
        geneticAlgorithmAnalyzer.analyze(data);
    }
}
