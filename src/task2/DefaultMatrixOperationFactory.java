package task2;

public class DefaultMatrixOperationFactory extends MatrixOperationFactory {
    @Override
    MatrixOperation createOperation(String operationType) {
        switch (operationType.toLowerCase()) {
            case "addition":
                return new MatrixAddition();
            case "multiplication":
                return new MatrixMultiplication();
            case "determinant":
                return new DeterminantCalculator();
            default:
                throw new IllegalArgumentException("Неизвестный тип операции: " + operationType);
        }
    }
}
