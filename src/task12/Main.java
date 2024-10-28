package task12;

public class Main {
    public static void main(String[] args) {
        // Создание меню
        Category mainCourse = new Category("Main Course");
        mainCourse.addItem(new Dish("Steak", 20.0));
        mainCourse.addItem(new Dish("Chicken", 15.0));
        mainCourse.addItem(new Dish("Fish", 18.0));

        Category desserts = new Category("Desserts");
        desserts.addItem(new Dish("Ice Cream", 5.0));
        desserts.addItem(new Dish("Cake", 6.0));

        Category drinks = new Category("Drinks");
        drinks.addItem(new Dish("Water", 2.0));
        drinks.addItem(new Dish("Juice", 3.0));
        drinks.addItem(new Dish("Coffee", 4.0));

        Category appetizers = new Category("Appetizers");
        appetizers.addItem(new Dish("Salad", 8.0));
        appetizers.addItem(new Dish("Soup", 7.0));

        Category menu = new Category("Menu");
        menu.addItem(appetizers);
        menu.addItem(mainCourse);
        menu.addItem(desserts);
        menu.addItem(drinks);

        RestaurantMenu restaurantMenu = new RestaurantMenu(menu);
        restaurantMenu.printMenu();
    }
}
