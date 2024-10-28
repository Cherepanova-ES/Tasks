package task12;

public class Dish implements MenuItem {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void printMenu(int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += " ";
        }
        System.out.println(indent + name + " - $" + price);
    }
}
