package task10;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();

        // Запуск автомобиля с установкой температуры и воспроизведением музыки
        car.startCar(22, "My Favorite Song");

        // Остановка автомобиля
        car.stopCar();
    }
}

