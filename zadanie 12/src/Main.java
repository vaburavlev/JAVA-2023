import java.util.ArrayList;
import java.util.List;

// Компонент, который представляет как блюда, так и категории блюд
interface MenuComponent {
    String getName();
    double getPrice();
    void print();
}

// Лист, представляющий отдельное блюдо
class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Блюдо: " + name + ", Цена: " + price);
    }
}

// Контейнер, представляющий категорию блюд
class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent item) {
        items.add(item);
    }

    public void remove(MenuComponent item) {
        items.remove(item);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        double totalPrice = 0;
        for (MenuComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void print() {
        System.out.println("Категория: " + name);
        for (MenuComponent item : items) {
            item.print();
        }
    }
}

abstract class RestaurantMenu {
    public static void main(String[] args) {
        MenuComponent menu = new MenuCategory("Меню ресторана");

        MenuComponent breakfastMenu = new MenuCategory("Завтрак");
        MenuComponent lunchMenu = new MenuCategory("Обед");
        MenuComponent dinnerMenu = new MenuCategory("Ужин");

        MenuComponent omelette = new MenuItem("Омлет", 5.99);
        MenuComponent pancakes = new MenuItem("Блины", 4.99);
        MenuComponent pasta = new MenuItem("Паста", 8.99);
        MenuComponent steak = new MenuItem("Стейк", 12.99);

        ((MenuCategory) breakfastMenu).add(omelette);
        ((MenuCategory) breakfastMenu).add(pancakes);
        ((MenuCategory) lunchMenu).add(pasta);
        ((MenuCategory) dinnerMenu).add(steak);

        ((MenuCategory) menu).add(breakfastMenu);
        ((MenuCategory) menu).add(lunchMenu);
        ((MenuCategory) menu).add(dinnerMenu);

        menu.print();
    }
}
