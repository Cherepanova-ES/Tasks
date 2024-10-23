package task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//вариант 5//
//Напишите программу для управления разными видами домашних животных (собаки, кошки, попугаи) с помощью фабричного метода.

public class AnimalManager {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(String type) {
        animals.add(AnimalFactory.createAnimal(type));
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " говорит: ");
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить животное");
            System.out.println("2. Показать животных");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                System.out.print("Введите тип животного (dog, cat, parrot): ");
                String animalType = scanner.nextLine();
                manager.addAnimal(animalType);
            } else if (choice == 2) {
                manager.showAnimals();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный выбор.");
            }
        }
        scanner.close();
    }
}
