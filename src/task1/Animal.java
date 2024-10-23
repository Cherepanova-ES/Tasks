package task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface Animal {
    void makeSound();
    String getType();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public String getType() {
        return "Собака";
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    public String getType() {
        return "Кошка";
    }
}

class Parrot implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Привет!");
    }

    @Override
    public String getType() {
        return "Попугай";
    }
}