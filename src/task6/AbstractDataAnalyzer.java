package task6;

public abstract class AbstractDataAnalyzer implements DataAnalyzer {

    @Override
    public final void analyze(Data data) {
        preprocess(data);
        performAnalysis(data);
        postprocess(data);
    }

    protected abstract void performAnalysis(Data data);

    protected void preprocess(Data data) {
        System.out.println("Preprocessing data...");
        // Общая логика предобработки данных
    }

    protected void postprocess(Data data) {
        System.out.println("Postprocessing data...");
        // Общая логика постобработки данных
    }
}
