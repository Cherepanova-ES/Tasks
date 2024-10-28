package task12;
import java.util.ArrayList;
import java.util.List;

public class Category implements MenuItem {
    private String name;
    private List<MenuItem> items = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0; // Категории не имеют цены
    }

    @Override
    public void printMenu(int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += " ";
        }
        System.out.println(indent + name + ":");
        for (MenuItem item : items) {
            item.printMenu(level + 1);
        }
    }
}
