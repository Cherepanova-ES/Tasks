package task2;

public class DeterminantCalculator implements MatrixOperation {
    @Override
    public double[][] perform(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix1[0].length) {
            throw new IllegalArgumentException("Матрица должна быть квадратной для вычисления определителя.");
        }
        if (matrix1.length != 2) {
            throw new UnsupportedOperationException("Программа поддерживает вычисление определителя только для матриц 2x2.");
        }
        double determinant = matrix1[0][0] * matrix1[1][1] - matrix1[0][1] * matrix1[1][0];
        return new double[][] {{determinant}};
    }
}
