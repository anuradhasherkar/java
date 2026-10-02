import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

class ShoppingCart {
    HashMap<Integer, Product> products = new HashMap<>();
    ArrayList<String> orderHistory = new ArrayList<>();

    void addProduct(Product p) {
        products.put(p.id, p);
    }

    void removeProduct(int id) {
        products.remove(id);
    }

    void displayProducts() {
        for (Product p : products.values())
            System.out.println(p);
    }

    void placeOrder() {
        double total = 0;

        for (Product p : products.values())
            total += p.price;

        String order = "Order placed. Total = " + total;
        orderHistory.add(order);

        System.out.println(order);
        products.clear();
    }

    void displayHistory() {
        System.out.println("\nOrder History:");
        for (String order : orderHistory)
            System.out.println(order);
    }
}

public class Program7 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product(1, "Laptop", 50000));
        cart.addProduct(new Product(2, "Mouse", 1000));
        cart.addProduct(new Product(3, "Keyboard", 2000));

        System.out.println("Products:");
        cart.displayProducts();

        cart.placeOrder();
        cart.displayHistory();
    }
}
