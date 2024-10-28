package task12;

public class RestaurantMenu {
    private MenuItem root;

    public RestaurantMenu(MenuItem root) {
        this.root = root;
    }

    public void printMenu() {
        root.printMenu(0);
    }
}
