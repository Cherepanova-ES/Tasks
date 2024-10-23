package task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class AnimalFactory {
    private static final Map<String, Class<? extends Animal>> animalTypes = new HashMap<>();

    static {
        animalTypes.put("dog", Dog.class);
        animalTypes.put("cat", Cat.class);
        animalTypes.put("parrot", Parrot.class);
    }

    public static Animal createAnimal(String type) {
        Class<? extends Animal> animalClass = animalTypes.get(type.toLowerCase());
        if (animalClass != null) {
            try {
                return animalClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        throw new IllegalArgumentException("Неизвестный тип животного: " + type);
    }
}
