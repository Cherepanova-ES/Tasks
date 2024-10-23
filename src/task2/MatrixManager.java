package task2;
import java.util.Scanner;
public class MatrixManager {
    private MatrixOperationFactory factory;

    public MatrixManager(MatrixOperationFactory factory) {
        this.factory = factory;
    }

    public double[][] performOperation(String operationType, double[][] matrix1, double[][] matrix2) {
        MatrixOperation operation = factory.createOperation(operationType);
        return operation.perform(matrix1, matrix2);
    }

    public static void main(String[] args) {
        MatrixManager manager = new MatrixManager(new DefaultMatrixOperationFactory());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Сложение матриц");
            System.out.println("2. Умножение матриц");
            System.out.println("3. Вычисление определителя");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                double[][] matrix1 = getMatrixFromInput(scanner);
                double[][] matrix2 = getMatrixFromInput(scanner);
                double[][] result = manager.performOperation("addition", matrix1, matrix2);
                printMatrix(result);
            } else if (choice == 2) {
                double[][] matrix1 = getMatrixFromInput(scanner);
                double[][] matrix2 = getMatrixFromInput(scanner);
                double[][] result = manager.performOperation("multiplication", matrix1, matrix2);
                printMatrix(result);
            } else if (choice == 3) {
                double[][] matrix = getMatrixFromInput(scanner);
                double[][] result = manager.performOperation("determinant", matrix, null);
                printMatrix(result);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Неверный выбор.");
            }
        }
        scanner.close();
    }

    private static double[][] getMatrixFromInput(Scanner scanner) {
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double[][] matrix = new double[rows][cols];
        System.out.println("Введите элементы матрицы по строкам:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume newline character
        }
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        System.out.println("Результат:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
